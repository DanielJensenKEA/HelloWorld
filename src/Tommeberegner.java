import java.util.Scanner;

public class Tommeberegner {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        // Velkomstsmeddelelse
        System.out.println("Pænt goddag, hvor mange tommer vil du beregne?");

        // Brugeren får lov til at indtaste en kommatalsværdi.
        double tommer = input.nextDouble();

        // Efter brugerinput får brugeren en besked om, at der vil ske omberegning af tommer til centimeter.
        System.out.println("Vi vil følgende omberegne " + tommer + " tommer til centimeter :)");

        // Der laves en double konstant. Der går 2,54 cm på en tomme.
        final double cMPrTomme = 2.54;

        double tommerCM = cMPrTomme * tommer;

        // Bruger får besked om omberegningen.
        System.out.println(tommer + " tomme(r) svarer til " + tommerCM + " centimeter");

        // Vi afslutter med et smil.
        System.out.println("Tak fordi du benyttede Daniels tommeberegner. :>");



    }
}
