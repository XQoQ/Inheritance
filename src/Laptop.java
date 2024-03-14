class Laptop extends ElectronicDevice {
    String processor;

    public Laptop(String brand, double price, String processor) {
        super(brand, price);
        this.processor = processor;
    }

    public void bootUp() {
        System.out.println("Booting up the laptop.");
    }
}