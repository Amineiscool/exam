package BuildingPc;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    private String description;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    


    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public void load() {
    }

    public void printBadge() {
        System.out.println("for motherboard Manufacturer: " + this.manufacturer);
        System.out.println("for motherboard Model: " + this.model);
        System.out.println("for motherboard RAM Slots: " + this.ramSlots);
        System.out.println("for motherboard Card Slots: " + this.cardSlots);
        System.out.println("for motherboard BIOS: " + this.bios);
    }

}


