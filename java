public class Car {

    String name;
    String model;
    int year;

    // Constructor with correct parameter list and matching class name
    Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        // Corrected constructor arguments
        Car c1 = new Car("Suzuki", "Swift", 2020);
        c1.displayInfo();
    }
}
