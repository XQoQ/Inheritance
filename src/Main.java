public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Apple", 999.99, 6);
        myPhone.displayInfo();
        myPhone.makeCall();

        System.out.println();

        Laptop myLaptop = new Laptop("Dell", 1299.99, "Intel Core i7");
        myLaptop.displayInfo();
        myLaptop.bootUp();
    }
}