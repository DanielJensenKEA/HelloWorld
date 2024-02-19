import java.util.Scanner;

public class Tidsberegner2 {
    public static void main (String[] args){
        int secondsInADay = 86400;
        int secondsInAnHour = 3600;
        int secondsInAMinute = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer er der gået?");
        int timer = input.nextInt();
        System.out.println("Der er gået " + timer + " timer.");
        int sekunderTilbage = timer * secondsInAnHour;
        System.out.println(timer + " timer svarer til " + sekunderTilbage + " sekunder.");
        System.out.println("Der er dermed gået " + sekunderTilbage + " sekunder fra midnat på " + timer + " timer.");

        /*
        int sekunderTilMidnat = secondsInADay - sekunderTilbage;
        System.out.println("Der er " + sekunderTilMidnat + " sekunder til midnat.");
        */
    }
}
