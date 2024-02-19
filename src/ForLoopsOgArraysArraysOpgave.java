public class ForLoopsOgArraysArraysOpgave {
    public static void main (String [] args) {
        int [] myArray1 = new int [] {34, 0, 0, 0, 0, 0, 0, 117};
        for(int i = 0; i <= 7; i++) {
            System.out.print(myArray1[0 + i] + " ");
        }

        // int [] arrayeksempel = new int [8]
        //array[0] = 8
        //array[8] = 117
        System.out.println();
        String [] myArrayStrings = new String[] {"Hej ", "med ", "dig."};

        for(int v = 0; v <= 2; v++) {
            System.out.print(myArrayStrings[0+v]);
        }
        double [] myDoubleArray = new double [] {3.4, 2.5, 1.2, 6.7};
        System.out.println();

        // For each string : for (string i : goddag) {
        //
        // for (String v : goddag)
        //System.out.println(" " + i);

        //Sende index 2 til print fra myDoubleArray
        System.out.println(myDoubleArray[2]);
        //Sende array længde til print.
        System.out.println(myDoubleArray.length);
    }
}
