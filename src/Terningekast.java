import java.util.Random;

public class Terningekast {
    public static void main(String[] args) {
        boolean gentag = true;
        int terning1;
        int terning2;
        Random rand = new Random();
        int kravsum = 7;
        int attempts = 0;

        while (gentag) {
            attempts++;
            //Random nextint sættes til 7, da den ikke er inclusive.
            //For at slå en seksidet terning skal range derfor sættes til 7.
            terning1 = rand.nextInt(7) + 1;
            terning2 = rand.nextInt(7) + 1;

            System.out.println("Der blev kastet " + terning1 + "+" + terning2 + ".");
            int sum = terning1 + terning2;
            if (sum == kravsum) {
                System.out.println(terning1 + " og " + terning2 + " blev kastet. Kravsum på " + kravsum + ".");
                System.out.println("Der blev foretaget " + attempts + " kast med to terninger.");
                gentag = false;
            }

        }
    }
}
