import java.util.Scanner;

public class WhileLoopMedSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        int sum = 0;
        int tal = 0;
        Scanner input = new Scanner (System.in);


        while (tal != SENTINEL) {
            System.out.println("Indtast dit tal, der skal lægges sammen. Tast -1 for at afslutte.");
            sum+=tal;
            tal = input.nextInt();


        }
        System.out.println("Du har fået følgende resultat:");
        System.out.println(sum);
    }
}
