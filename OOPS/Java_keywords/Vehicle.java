package Java_keywords;
public class Vehicle {

    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid object. Not a Vehicle.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Siddhi", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Rohan", "Bike", "MH14XY5678");

        v1.displayDetails(v1);
        System.out.println("-------------------");
        v2.displayDetails(v2);

        updateRegistrationFee(6000.0);

        System.out.println("\nAfter updating registration fee:");
        v1.displayDetails(v1);
    }
}
