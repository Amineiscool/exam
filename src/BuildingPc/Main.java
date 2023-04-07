package BuildingPc;

public class Main {
    public static void main(String[] args) {
        Case myCase = new Case("'Windows xp", "Microsoft.", "220 volts", new Dimensions(20, 40, 50));
        Monitor myMonitor = new Monitor("ABC1234", "Samsung", new Resolution(1920, 1080));
        Motherboard myMotherBoard = new Motherboard("AB-456", "Intel", 4, 2, "Phoenix");

        Pc myPC = new Pc(myCase, myMotherBoard, myMonitor);
        myPC.description();
        myPC.powerUp();

        Pc myPc = new Pc(myCase, myMotherBoard, myMonitor);
        myMotherBoard.printBadge();

        myCase.printBadge();

        myMonitor.printBadge();

        System.out.println( " is now running...");

    }
}


