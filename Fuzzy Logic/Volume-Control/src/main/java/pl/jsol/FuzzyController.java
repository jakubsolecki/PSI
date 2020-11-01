package pl.jsol;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.rule.FuzzyRuleSet;

public class FuzzyController {

    public static void main(String[] args) {
        try {
            String fileName = args[0];
            int intensityLevel = Integer.parseInt(args[1]);
            int dayTime = Integer.parseInt(args[2]);

            FIS fis = FIS.load(fileName, true);

            if (fis == null) {
                System.out.println("Cannot load file '" + fileName +"'");
                return;
            }

            FuzzyRuleSet fuzzyRuleSet = fis.getFuzzyRuleSet();
            fuzzyRuleSet.chart();

            fuzzyRuleSet.setVariable("intensity_level", intensityLevel);
            fuzzyRuleSet.setVariable("day_time", dayTime);

            fuzzyRuleSet.evaluate();

            fuzzyRuleSet.getVariable("intensity_change").chartDefuzzifier(true);

            System.out.println(fuzzyRuleSet);
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
