package BuildingPc;

public class Case  {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
    private String description;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }



    public void pressPowerButton() {
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nManufacturer: " + manufacturer + "\nPower Supply: " + powerSupply + "\nDimensions: " + dimensions;
    }


    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void printBadge() {
        System.out.println("for case Model: " + this.model);
        System.out.println("for case Manufacturer: " + this.manufacturer);
        System.out.println("for case Power supply: " + this.powerSupply);
        System.out.println("for case Dimensions: " + this.dimensions.toString());
    }
}



