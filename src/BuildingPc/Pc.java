package BuildingPc;

public class Pc {

    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Pc(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }



        private void drawLogo() {
            int x = 10;
            int y = 10;
            int z = 5;
            monitor.drawPixel(x, y, z);
        }



    public void description() {
        String message = "Welcome to Worst Buy! Below is the description of the PC on sale today:" + "Case: " + pcCase.getDescription() + "\n" + "Motherboard: " + motherboard.getDescription() + "\n" + "Monitor: " + monitor.getDescription();

        System.out.println(message);
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.load();
    }

}



