import java.util.Scanner;

public class Portoberegner {
        public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        final int BREV100G = 100;
        final int BREV250G = 250;
        final int BREV2000G = 2000;

        int pris = 0;
        String fejlkode = "Et brev med denne vægt kan vi ikke sende.";
        System.out.println("Hvor mange gram vejer dit brev?");
        double brevVægt = input.nextDouble();

        int porto = 0;
        //Der gives en fejlkode, såfremt brevvægten er lig med eller under 0 gram eller brevvægten er over 2000g.
        if (brevVægt <= 0 || brevVægt > 2000) {
            System.out.println(fejlkode);
        } else {
            //Hvis den indtastede brevvægt er lig med eller mindre end 100G, så er portoen 25,-.
            if (brevVægt <= BREV100G) {
                porto = 25;
            }
            //Hvis den indtastede brevvægt er lig med eller mindre end 250g, så er portoen 50,-.
            else if (brevVægt <= BREV250G) {
                porto = 50;
            }
            //Hvis den indtastede brevvægt er lig med eller mindre end 2000g, så er portoen 75,-.
            else if (brevVægt <= BREV2000G) {
                porto = 75;
            }
            System.out.println("Dit brev koster " + porto + " kroner at forsende.");
        }
    }
}
