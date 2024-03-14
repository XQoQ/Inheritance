class Smartphone extends ElectronicDevice {
    int screenSize;

    public Smartphone(String brand, double price, int screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public void makeCall() {
        System.out.println("Making a call with the smartphone.");
    }
}