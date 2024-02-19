import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BMIBeregner {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        // Velkomstbesked
        System.out.println("Velkommen til BMI Beregner. Indtast venligst din vægt i kilogram.");

        //Bruger indtaster vægt i kilogram.
        double vægtIKg = input.nextDouble();

        //Brugeren får besked om indtastede input.
        System.out.println("Du har indtastet, at du vejer " + vægtIKg + "kg");

        //Brugeren skal indtaste højde i meter.
        System.out.println("Indtast venligst din højde i meter.");

        //Bruger indtaster højde i meter
        double højdeIMeter = input.nextDouble();

        //Brugeren får besked om indtastede input.
        System.out.println("Du har indtastet, at du er " + højdeIMeter + " meter høj.");

        //BMI Beregnes. Vægt i KG divideres med 2x højde. Matas BMI beregner formel er benyttet.
        double bMIBeregnet = vægtIKg/(højdeIMeter*højdeIMeter);

        //Beregning
        System.out.println("BMI Beregning = " + bMIBeregnet);

        //Konstanter for bmi => Under-, normal- eller overvægtig.
        //Undervægtig = under 18.5 i BMI
        final double UNDERVÆGTIG = 18.5;
        //Normalvægtig = Mellem 18.5-25.
        final double normalvægtig = 25;
        //Overvægtig 25-30
        final double overvægtig = 30;
        //Svært overvægtig = over 30
        final double sværtOvervægtig = 30;

        //Hvis den beregnede bmi er under 18,5
        if (bMIBeregnet < UNDERVÆGTIG) {
            System.out.println("Du er undervægtig.");
        }
        //Hvis den beregnede bmi er under 25
        else if (bMIBeregnet < normalvægtig ) {
            System.out.println("Du er normalvægtig.");
        }
        //Hvis den beregnede værdi er over 25, men under 30.
        else if (bMIBeregnet < overvægtig) {
            System.out.println("Du er overvægtig.");
        }
        //Hvis den beregnede værdi er over 30.
        else {
            System.out.println("Du er svært overvægtig");
        }
        //Nedenfor et eksempel på kode i forbindelse med if og else statements.
        /*
        String str;
        if ( bmi < 18.5) {
            str = "Under";
        } else if (bmi < 25) {
            str = "normal";
        } else if (bmi < 30) {
            str = "over";
        } else  (bmi > 30) {
            str = "svært over";
        }
        System.out.println("Du er " + str +"vægtig");

         */
    }
}
