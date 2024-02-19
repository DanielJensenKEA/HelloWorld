public class Tid {
    public static void main (String [] args) {
       int second =  36;
       int minute = 17;
       int hour = 11;
       int sekunderKS1 = 17*60 + 11*3600 + 36;
       int secondsSinceMidnight = 40080;
       int secondsUntilMidnight = 45300;
       int secondsInADay = 86400;
       int secondsLeftToday = 46320;
       int hourNow = 11;
       int minuteNow= 32;
       int secondNow = 36;
       int sekunderKS2 = 11*3600 + 36 + 32*60;
       int sekunderBrugt = sekunderKS2 - sekunderKS1;


       // System.out.println(sekunderKS1);
        System.out.println("Der er gået " + sekunderBrugt + " sekunder med at fuldende opgaven.");
        //System.out.println(secondsInADay - secondsSinceMidnight);
        //System.out.println("Siden midnat er der gået " + secondsSinceMidnight + " sekunder.");
        // System.out.println("Time:" + hour + " "  + "Minut:" + minute + " " + "Sekund:" + " " + second);
    }
}
