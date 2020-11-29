package main;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class FuzzyController {

    public static void main(String[] args) {
        try {
            String fileName = args[0];
            int timeToDeadline = Integer.parseInt(args[1]);
            int difficultyLevel = Integer.parseInt(args[2]);
            int timeConsumption = Integer.parseInt(args[3]);

            FIS fis = FIS.load(fileName, true);

            if (fis == null) {
                System.err.println("Cannot load file '" + fileName +"'");
                return;
            }

            /* uses the newest version of jFuzzyLogic library (jFuzzyLogic.jar) */

            FunctionBlock functionBlock = fis.getFunctionBlock(null);
            JFuzzyChart.get().chart(functionBlock);

            fis.setVariable("timeToDeadline", timeToDeadline);
            fis.setVariable("difficultyLevel", difficultyLevel);
            fis.setVariable("timeConsumption", timeConsumption);

            fis.evaluate();

            Variable v = functionBlock.getVariable("urgencyLevel");
            JFuzzyChart.get().chart(v, v.getDefuzzifier(), true);

            System.out.println(fis);


        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Incorrect number of parameters. Eg.: " +
                    "java Can_I_Do_It_Tomorrow string<file_fcl> int<time to deadline> int<difficulty level> int<time consumption>");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect parameter. Eg.: " +
                    "java Can_I_Do_It_Tomorrow string<file_fcl> int<time to deadline> int<difficulty level> int<time consumption>");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

