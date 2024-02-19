import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main (String [] args) {
        /*
        int numberToGuess = 5;

         */
        int userToGuess = -1;
        boolean gentag = true;
        Scanner scanner = new Scanner(System.in);
        Random rand1 = new Random();
        int numberToGuess = rand1.nextInt(10) + 1;
        int attempts = 0;

        while (gentag) {
            System.out.println("Indtast venligst et tal mellem 1 og 10.");
            userToGuess = scanner.nextInt();
            attempts++;

            if (userToGuess == numberToGuess) {
                gentag = false;
                System.out.println("Du har gættet rigtigt!" + " Tallet, som du skulle gætte var " + numberToGuess);
                System.out.println(attempts + " gange blev forsøgt.");
            }
            else if (userToGuess != numberToGuess) {
                System.out.println("Du har gættet forkert.");
            }if (userToGuess > numberToGuess) {
                System.out.println("Tæt på! Tallet er mindre end " + userToGuess);
            }if (userToGuess < numberToGuess) {
                System.out.println("Tæt på! Tallet er højere end " + userToGuess);
            }
            }
        }

/*
        Random rand = new Random();
        int numberToGuess1 = rand.nextInt(10)+1;
        if (numberToGuess1 != rand.nextInt());
        System.out.println("Du har gættet forkert.");

 */


}
