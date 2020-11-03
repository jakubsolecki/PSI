package pl.jakubsolecki;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class FuzzyController {

    public static void main(String[] args) {
        try {
            String fileName = args[0];
            int volumeLevel = Integer.parseInt(args[1]);
            int dayTime = Integer.parseInt(args[2]);

            FIS fis = FIS.load(fileName, true);

            if (fis == null) {
                System.err.println("Cannot load file '" + fileName +"'");
                return;
            }

            /* uses the newest version of jFuzzyLogic library (jFuzzyLogic.jar) */

            FunctionBlock functionBlock = fis.getFunctionBlock(null);
            JFuzzyChart.get().chart(functionBlock);

            fis.setVariable("volumeLevel", volumeLevel);
            fis.setVariable("dayTime", dayTime);

            fis.evaluate();

            Variable v = functionBlock.getVariable("volumeChange");
            JFuzzyChart.get().chart(v, v.getDefuzzifier(), true);

            System.out.println(fis);

            /* for older version (jFuzzyLogic_1_2_1.jar) */
/*
            FuzzyRuleSet fuzzyRuleSet = fis.getFuzzyRuleSet();
            fuzzyRuleSet.chart();

            fuzzyRuleSet.setVariable("volumeLevel", volumeLevel);
            fuzzyRuleSet.setVariable("dayTime", dayTime);

            fuzzyRuleSet.evaluate();

            fuzzyRuleSet.getVariable("volumeChange").chartDefuzzifier(true);

            System.out.println(fuzzyRuleSet);
*/



        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Incorrect number of parameters. Eg.: " +
                    "java Volume-Control string<file_fcl> int<intensity lvl> int<day time>");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Incorrect parameter. Eg.: " +
                    "java Volume-Control string<file_fcl> int<intensity lvl> int<day time>");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
