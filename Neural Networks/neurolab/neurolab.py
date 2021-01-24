import os
import unittest

# zmniejszamy ilosc informacji wyrzucana na konsole
os.environ['TF_CPP_MIN_LOG_LEVEL'] = '2'

# importujemy biblioteke pomagajaca w rysowaniu wykresow i wizualizacji
import matplotlib.pyplot as plt
# importujemy biblioteke pomagajaca w obliczeniach numerycznych
import numpy as np
# importujemy biblioteke pomagajaca nam w operacjach tensorowych i implementacji sieci neuronowej
import tensorflow as tf
# importujemy biblioteke pozwalajaca na latwe pobieranie i obsluge zbiorow danych
import tensorflow_datasets as tfds
# importujemy biblioteke pozwalajaca na wyswietlanie estetycznych paskow postepu
from tqdm import tqdm

# flaga od ktorej zalezy, czy beda pojawiac sie wizualizacje
SHOW_PLOTS = True


# TODO: Ponizej znajduje sie narzedziownik - zbior przydatnych klas i funkcji, w pelni wystarczajacy do zrobienia zadan
# tf.constant
# tf.math.log
# tf.nn.relu
# tf.nn.softmax
# tf.random.truncated_normal
# tf.one_hot
# operatory + - * / @
#
# (funkcji kerasowych uzywamy dopiero od zadania czwartego)
# tf.keras.layers.Dense
# tf.keras.losses.CategoricalCrossentropy
# tf.keras.optimizers.SGD


# funkcja dokomunujaca wstepnej obrobki wejsciowych obrazow
@tf.function
def process_input(x):
    # przeksztalcamy obraz, by wartosci pikseli zawieraly sie miedzy 0.0 a 1.0 (a nie 0 i 255)
    y = tf.image.convert_image_dtype(x, dtype=tf.float32)
    # przeksztalcamy go w wektor o liczbie wymiarow rownej liczbie pikseli
    y = tf.reshape(y, [-1, 28 * 28])
    return y


# TODO: zastap None, dokoncz implementacje funkcji L (entropii krzyzowej)
@tf.function
def cross_entropy(predicted_labels, labels):
    y = tf.math.multiply(tf.one_hot(labels, 10), tf.math.log(predicted_labels)) # TODO: DONE
    # tu zliczamy suma dla kazdego przykladu treningowego
    # pamietaj, ze poniewaz bierzemy pod uwage tylko jedno wyjscie, to powinna byc to suma pewnej wartosci i samych zer
    y = -tf.reduce_sum(y, axis=[1])
    # tu bierzemy srednia entropie z calego batcha
    y = tf.reduce_mean(y)
    return y


# funkcja pomocnicza liczaca srednia trafnosc predykcji i srednia wartosc straty
def measure_loss_and_accuracy(dataset, batch_size, model):
    # tworzymy kontenery do zbiorania wartosci sredniej
    mean_loss = tf.keras.metrics.Mean("loss")
    mean_accuracy = tf.keras.metrics.Mean("accuracy")
    # iterujemy po paczkach przykladow z wybranego zbioru
    for images, labels in tqdm(dataset.batch(batch_size)):
        # uruchamiamy model dla danych wejsciowych
        label_probabilities = model(images)
        # obliczamy wartosc straty
        loss = cross_entropy(label_probabilities, labels)
        # dodajemy obliczona wartosc do kontenera
        mean_loss.update_state(loss)
        # przewidujemy jako wynik koncowy klase z najwyzszym prawdopodobienstwem
        predicted_labels = tf.argmax(label_probabilities, 1)
        # sprawdzamy, czy predykcja byla zgodna z rzeczywistoscia
        correct_predictions = tf.equal(predicted_labels, labels)
        # dodajemy rezultaty do kontenera
        mean_accuracy.update_state(correct_predictions)
    # z kontenerow wyciagamy odpowiednie wartosci srednie i zapisujemy do zmiennych
    mean_loss_result, mean_accuracy_result = mean_loss.result().numpy(), mean_accuracy.result().numpy()
    # resetujemy kontenery
    mean_loss.reset_states()
    mean_accuracy.reset_states()
    # zwracamy obliczone wyniki (trafnosc predukcji wyrazona w %)
    return mean_loss_result, mean_accuracy_result * 100.0


# funkcja pomocnicza sluzaca do trenowania wybranego modelu
def train_model(dataset, batch_size, model, trainable_variables, optimizer):
    # iterujemy po paczkach przykladow z wybranego zbioru
    for images, labels in tqdm(dataset.batch(batch_size)):
        # zapamietujemy efekty obliczen by w przyszlosci efektywnie obliczyc gradient
        with tf.GradientTape() as tape:
            # uruchamiamy model dla danych wejsciowych
            label_probabilities = model(images)
            # obliczamy wartosc straty
            loss = cross_entropy(label_probabilities, labels)
        # znajdujemy gradient ze straty po tych zmiennych, ktore chcemy optymalizowac
        gradients = tape.gradient(loss, trainable_variables)
        # wykorzystujemy optymalizator gradientowy w celu modyfikacji tych zmiennych tak, by srednia strata malala
        optimizer.apply_gradients(zip(gradients, trainable_variables))


# funkcja pomocnicza wizualizujaca stan wybranych macierzy wag
def plot_weights(w, max_i, max_j):
    plt.figure()
    for i in range(max_i):
        for j in range(max_j):
            ax = plt.subplot2grid((max_i, max_j), (i, j))
            ax.imshow(w.numpy()[:, i * max_j + j].reshape((28, 28)), cmap='coolwarm')
    plt.show()
    plt.clf()


class TestChapterOne(unittest.TestCase):
    def setUp(self):
        # ladujemy przykladowe dane wejsciowe (klasyczny juz zbior danych z roznymi rodzajami ubran)
        (self.ds_train, self.ds_test), self.ds_info = tfds.load(
            'fashion_mnist',
            # korzystamy z gotowego podziału na czesc treningowa i testowa
            split=['train', 'test'],
            # zwracamy tez informacje o klasach, ktore reprezentuja elementy
            as_supervised=True,
            # zwracamy ogolna informacje o zbiorze
            with_info=True
        )
        # przygotowujemy silnik optymalizujacy (w tym przypadku oparty o wspomniany spadek po gradiencie)
        self.optimizer = tf.keras.optimizers.SGD(0.1)

    # metoda pomocznicza liczaca metryki dla zbioru treningowego i testowego
    def evaluate_metrics(self, batch_size, model):
        train_loss, train_accuracy = measure_loss_and_accuracy(
            dataset=self.ds_train,
            batch_size=batch_size,
            model=model,
        )
        test_loss, test_accuracy = measure_loss_and_accuracy(
            dataset=self.ds_test,
            batch_size=batch_size,
            model=model,
        )
        print(
            f"train loss: {train_loss} / "
            f"train accuracy: {train_accuracy} % / "
            f"test loss: {test_loss} / "
            f"test accuracy: {test_accuracy} %/ "
        )
        return train_loss, train_accuracy, test_loss, test_accuracy

    # metoda pomocnicza uczaca i oceniajaca nasza siec neuronowa
    def evaluate_model(self, model, trainable_variables, visualised_weights, batch_size, epochs_no, target_accuracy):
        _, _, _, test_accuracy = self.evaluate_metrics(batch_size, model=model)

        # nauka odbywa sie przez zadana liczbe epok
        for epoch in range(epochs_no):
            print(f"epoch: {epoch}/{epochs_no}")
            train_model(
                dataset=self.ds_train,
                batch_size=batch_size,
                model=model,
                trainable_variables=trainable_variables,
                optimizer=self.optimizer,
            )
            _, _, _, test_accuracy = self.evaluate_metrics(batch_size, model=model)

        if SHOW_PLOTS:
            plot_weights(visualised_weights, 2, 5)

        # sprawdzamy, czy wynik zgadza sie z oczekiwanym przynajmniej w przyblizeniu
        np.testing.assert_almost_equal(test_accuracy, target_accuracy, decimal=0)

    def test_intro(self):
        if SHOW_PLOTS:
            tfds.show_examples(self.ds_train, self.ds_info)
            plt.show()
            plt.clf()
        # TODO: DONE

    def test_exercise_one(self):
        # wykonamy nasza pierwsza (jednowarstwowa) siec neuronowa!

        # przygotowujemy zmienne - tensory ktorych wartosci beda ewoluowac w czasie
        # inicjujemy je zerami o wlasciwym ksztalcie - tu wlasnie znajda sie poszukiwane przez nas optymalne wagi
        w = tf.Variable(tf.zeros([28 * 28, 10]))
        b = tf.Variable(tf.zeros([10]))

        # TODO: zastap None odpowiednimi wyrazeniami, zaimplementuj f ze skryptu

        # to jest pomocnicza funkcja realizujaca liniowa warstwe bez aktywacji
        @tf.function
        def linear(x):
            # tutaj wykonujemy odpowiednie mnozenie przez wagi i przesuniecie o bias
            y = x @ w + b  # TODO: DONE
            return y

        # to jest wlasciwa funkcja definiujaca kolejne operacje wykonywane przez nasza (plytka) siec neuronowa
        @tf.function
        def model(x):
            y = process_input(x)
            y = linear(y)
            # tutaj obliczamy aktywacje wyjscia z uzyciem tzw. miekkiego maksimum
            y = tf.nn.softmax(y)  # TODO: DONE
            return y

        self.evaluate_model(
            model=model,
            trainable_variables=[w, b],
            visualised_weights=w,
            batch_size=100,
            epochs_no=25,  # jezeli chcesz, to po prawidlowym wykonaniu zadan mozesz eksperymentowac z tymi stalymi
            target_accuracy=84.0  # taki wynik powinnismy mniej-wiecej uzyskac, czy sie udalo?
        )

    def test_exercise_two(self):
        # TODO: zaimplementuj siec posiadajaca jedna warstwe wiecej
        # dodajemy do naszej sieci dodatkowa warstwe, w celu zwiekszenia jej pojemnosci i sily wyrazu

        # dodalismy dodatkowa warstwe wewnetrzna skladajaca sie ze 100 neuronow
        w1 = tf.Variable(tf.zeros([784, 100]))
        b1 = tf.Variable(tf.zeros([100]))
        # zwroc uwage, ze ksztalty poszczegolnych tensorow powinny do siebie pasowac!
        w2 = tf.Variable(tf.zeros([100, 10]))
        b2 = tf.Variable(tf.zeros([10]))

        # nadal liniowe mnozenie przez wagi, ale tym razem funkcja jest wielokrotnego uzytku
        @tf.function
        def linear(x, w, b):
            y = x @ w + b  # TODO: DONE
            return y

        # TODO: tym razem musimy przepuscic nasze dane przez dwie warstwy - wyjscie jednej bedzie wejsciem do kolejnej
        # dopilnuj, by kazda z nich korzystala z odpowiedniej aktywacji!
        @tf.function
        def model(x):
            y = process_input(x)
            # tutaj przepuszczamy przez pierwsza warstwe
            y = linear(y, w1, b1)  # TODO: DONE
            # i jej aktywacje (pamietaj, by uzyc wlasciwej!)
            y = tf.nn.relu(y)  # TODO: DONE
            # tutaj przepuszczamy przez warstwe druga
            y = linear(y, w2, b2)  # TODO: DONE
            # i aktywacje wyjsciowa (pamietaj, by uzyc wlasciwej!)
            y = tf.nn.softmax(y)  # TODO: DONE
            return y

        # TODO: wartosci jakich trzeba optymalizowac tym razem? uzupelnij odpowiedni parametr
        self.evaluate_model(
            model=model,
            trainable_variables=[w1, b1, w2, b2],  # TODO: DONE
            visualised_weights=w1,
            batch_size=100,
            epochs_no=5,
            target_accuracy=10.0
        )

    def test_exercise_three(self):
        # TODO: rozwiaz problem z poczatkowymi aktywacjami funkcji ReLU
        # zmien poczatkowe wartosci wag na losowe z odchyleniem standardowym od -0.1 do 0.1,
        # a biasy po prostu na stala wartosc rowna 0.1
        w1 = tf.Variable(tf.random.truncated_normal([784, 100], stddev=0.1))  # TODO: DONE
        b1 = tf.Variable(tf.ones([100])*0.1)  # TODO: zaimplementuj mnie, pieknie prosze!
        w2 = tf.Variable(tf.random.truncated_normal([100, 10], stddev=0.1))  # TODO: DONE
        b2 = tf.Variable(tf.ones([10])*0.1)  # TODO: DONE

        # TODO: pozostale elementy po prostu uzupelnij tak jak w cwiczeniu drugim (metoda copy-paste)!

        @tf.function
        def linear(x, w, b):
            y = x @ w + b  # TODO: DONE
            return y

        @tf.function
        def model(x):
            y = process_input(x)
            # tutaj przepuszczamy przez pierwsza warstwe
            y = linear(y, w1, b1)  # TODO: DONE
            # i jej aktywacje (pamietaj, by uzyc wlasciwej!)
            y = tf.nn.relu(y)  # TODO: DONE
            # tutaj przepuszczamy przez warstwe druga
            y = linear(y, w2, b2)  # TODO: DONE
            # i aktywacje wyjsciowa (pamietaj, by uzyc wlasciwej!)
            y = tf.nn.softmax(y)  # TODO: DONE
            return y

        self.evaluate_model(
            model=model,
            trainable_variables=[w1, b1, w2, b2],  # TODO: DONE
            visualised_weights=w1,
            batch_size=100,
            epochs_no=25,
            target_accuracy=88.0  # teraz klasyfikator powinien byc znacznie skuteczniejszy!
        )


class TestChapterTwo(unittest.TestCase):
    def setUp(self):
        def preproces_image(image, label):
            return tf.image.convert_image_dtype(image, dtype=tf.float32), tf.one_hot(label, 10)

        # ladujemy przykladowe dane wejsciowe (klasyczny juz zbior danych z roznymi rodzajami ubran)
        (self.ds_train, self.ds_test), self.ds_info = tfds.load(
            'fashion_mnist',
            # korzystamy z gotowego podziału na czesc treningowa i testowa
            split=['train', 'test'],
            # zwracamy tez informacje o klasach, ktore reprezentuja elementy
            as_supervised=True,
            # zwracamy ogolna informacje o zbiorze
            with_info=True
        )
        # przygotowujemy zbior do uzycia (zamieniamy labelki na wariant one-hot, a piksele na wartosci od 0.0 do 1.0)
        self.ds_train = self.ds_train.map(preproces_image)
        self.ds_test = self.ds_test.map(preproces_image)

    def test_exercise_four(self):
        # wszystko co robilismy w poprzednim rozdziale to budowa bardzo standardowych warstw
        # czy musimy rzeczywiscie kontrolowac recznie kazdy tensor? nie! mozemy wykorzystac gotowe juz elemeny!
        # tym razem stworzymy siec identyczna jak poprzednia, ale wykorzystujac wysokopoziomowa podbiblioteke Keras
        # ale nabyte umiejetnosci nie sa bezuzyteczne!
        # tensory wracaja gdy chcemy przygotowac nietypowa wlasna warstwe zgodna z API Kerasa!
        # tym razem tworzymy siec identyczna jak poprzednia, ale wykorzystujac wysokopoziomowa biblioteke Keras

        # TODO: przygotuj model kerasowy!
        # nasza siec bedzie skladac sie z sekwencji warstw (wymienionych ponizej)
        model = tf.keras.models.Sequential([
            # definiuje rozmiar wejscia, moze byc istotne dla kolejnych warstw
            tf.keras.Input(shape=(28, 28, 1)),
            # zmienia ksztalt wejscia z (28, 28, 1) na (784, )
            tf.keras.layers.Flatten(),
            # TODO: zastap None uzywajac tf.keras.layers.Dense, pamietaj o odpowiednim rozmiarze wyjsciowym i aktywacji!
            # pierwsza prawdziwa warstwa neuronow
            tf.keras.layers.Dense(100, activation='relu'),  # TODO: DONE
            # TODO: zastap None (analogicznie), pamietaj o wlasciwych rozmiarach i aktywacji!
            # koncowa warstwa neuronow
            tf.keras.layers.Dense(10, activation='softmax'),  # TODO: DONE
        ])
        # teraz kompilujemy nasz zdefiniowany wczesniej model
        model.compile(
            # tu podajemy czym jest funkcja loss
            # TODO: zastap None wybierajac wlasciwy wariant z tf.keras.losses
            loss=tf.keras.losses.CategoricalCrossentropy(),  # TODO: DONE
            # a tu podajemy jak ja optymalizowac
            # TODO: zastap None instancja wlasciwego silnika z tf.keras.optimizers (SGD = Stochastic Gradient Descent),
            # TODO: (c.d.) pamietaj o ustaleniu wartosci parametru learning rate (lr)
            optimizer=tf.keras.optimizers.SGD(0.1),  # TODO: DONE
            # informujemy, by w trakcie pracy zbierac informacje o uzyskanej skutecznosci
            metrics=['accuracy']
        )
        # podejrzenie tego z ilu i jakich warstw sklada sie nasza siec
        model.summary()

        # trenujemy nasz skompilowany model
        model.fit(self.ds_train.batch(100), epochs=25)
        # i oceniamy jego finalny stan
        train_results = model.evaluate(self.ds_train.batch(100))
        test_results = model.evaluate(self.ds_test.batch(100))
        print(
            f"train loss: {train_results[0]} / "
            f"train accuracy: {train_results[1] * 100} % / "
            f"test loss: {test_results[0]} / "
            f"test accuracy: {test_results[1] * 100} %/ "
        )
        np.testing.assert_almost_equal(test_results[1] * 100, 88.0, decimal=0)


class TestChapterThree(unittest.TestCase):
    def test_exercise_five(self):
        # na koniec skorzystamy z gotowej, wytrenowanej juz sieci glebokiej
        # TODO: uruchom przyklad pobierajacy gotowa siec, wytrenowana wczesniej na zbiorze ImageNet

        # pobranie gotowego modelu zlozonej sieci konwolucyjnej z odpowiednimi wagami
        # include_top=True oznacza ze pobieramy wszystkie warstwy - niektore zastosowania korzystaja tylko z dolnych
        model = tf.keras.applications.VGG19(weights='imagenet', include_top=True)
        # podejrzenie tego z ilu i jakich warstw sie sklada
        model.summary()
        # TODO: odpowiedz, o ile wieksza jest ta siec od wytrenowanej przez nas?
        # TODO: odpowiadam: 1.8 razy
        # otworzmy przykladowe zdjecie i dostosujemy jego rozmiar i zakres wartosci do wejscia sieci
        # TODO: zastap None ponizej zmieniajac rozmiar na taki, jaki przyjmuje wejscie sieci (skorzystaj z podsumowania)
        image_path = 'coil.jpg'
        image = tf.keras.preprocessing.image.load_img(
            image_path,
            target_size=(224, 224),  # TODO: DONE
        )
        # kolejne linie dodatkowo dostosowuja obraz pod dana siec
        x = tf.keras.preprocessing.image.img_to_array(image)
        x = np.expand_dims(x, axis=0)
        x = tf.keras.applications.vgg19.preprocess_input(x)

        # sprawdzmy jaki wynik przewidzi siec
        predictions = model.predict(x)
        # i przetlumaczmy uzywajac etykiet zrozumialych dla czlowieka (5 najbardziej prawdopodobnych klas zdaniem sieci)
        decoded_predictions = tf.keras.applications.vgg19.decode_predictions(predictions, top=5)[0]
        print('Predicted class:', decoded_predictions)
        # TODO: czy skonczylo sie sukcesem?
        # TODO: pobaw sie z innymi zdjeciami z Internetu - jak radzi sobie siec? kiedy sie myli? w jaki sposob?
        # TODO: wstawilem zdj cewki i w sumie to rozpoznało ją na 25% jako wiadro
        # TODO: (c.d.) pamietaj, ze siec rozumie tylko wymienione w ponizszym JSONIE klasy:
        # https://github.com/raghakot/keras-vis/blob/master/resources/imagenet_class_index.json

        # finalnie podgladamy aktywacje jakie wysylaja neurony sieci w trakcie dzialania
        # w wypisanych wczesniej informacjach mozna latwo spradzic ile kanalow ma warstwa o danym numerze (i ktora to)
        layer_to_preview = 4  # numer warstwy, ktorej aktywacje podgladamy
        channel_to_preview = 16  # numer kanalu w tejze warstwie
        get_activations = tf.keras.backend.function([model.layers[0].input], [model.layers[layer_to_preview].output])
        activations = get_activations([x])
        if SHOW_PLOTS:
            plt.imshow(activations[0][0, :, :, channel_to_preview], cmap='coolwarm')
            plt.show()
            plt.clf()
        # TODO: podejrzyj aktywacje w kolejnych warstwach; czym roznia sie te w poczatkowych od tych w koncowych?
        # TODO: odpowiadam: pierwsze warstwy wykrywają proste wzory np. linie czy kolory, a w kolejnych bardziej złożone
        # TODO: byty, np. kształty
