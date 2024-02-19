import java.util.Scanner;

public class Tidsberegner {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange hele timer er der gået?");
        int timer = input.nextInt();
        System.out.println("Der er gået " + timer +" timer");
        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();
        System.out.println("Hvor mange sekunder er der gået?");
        int sekunder = input.nextInt();

    }



}
