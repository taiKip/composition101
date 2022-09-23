
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dimensions dimensions = new Dimensions(20, 18, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("34inch UltraSharp", "Dell", 34, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
//Create pc
        PC thePC = new PC(theCase, theMonitor, motherBoard);
//invoke the objects in pc and use them to access their function.
      thePC.powerUp();
    }

}