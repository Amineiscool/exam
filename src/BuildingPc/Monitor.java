package BuildingPc;

public class Monitor {

        private String resolution;
        private String model;
        private String manufacturerName;
    private String description;
    private String Resolution;


    public Monitor(String resolution, String modelNumber, Resolution manufacturerName) {
            this.resolution = resolution;
            this.model = modelNumber;
            this.manufacturerName = String.valueOf(manufacturerName);
        }

        public void drawPixel(int x, int y, int color) {
            System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);



    }
    @Override
    public String toString() {
        return "Monitor: " + manufacturerName  + model  + resolution;
    }

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {
        this.description = description;

    }
    public void printBadge() {
        System.out.println("for Monitor model: " + model);
        System.out.println("for Monitor Manufacturer: " + manufacturerName);

        System.out.println("for Monitor Native resolution: " + Resolution  + Resolution);
    }

}




