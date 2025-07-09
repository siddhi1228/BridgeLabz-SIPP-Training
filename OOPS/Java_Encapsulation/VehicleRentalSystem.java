package Java_Encapsulation;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + maskPolicy();
    }

    private String maskPolicy() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days - 0.05 * getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + maskPolicy();
    }

    private String maskPolicy() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 2000;
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + maskPolicy();
    }

    private String maskPolicy() {
        return "****" + policyNumber.substring(policyNumber.length() - 4);
    }
}

class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];

        fleet[0] = new Car("MH12AB1234", 1500, "CAR123456789");
        fleet[1] = new Bike("MH14XY5678", 500, "BIKE987654321");
        fleet[2] = new Truck("MH10TR4321", 3000, "TRUCK24681357");

        int days = 5;

        for (Vehicle v : fleet) {
            double rental = v.calculateRentalCost(days);
            double insurance = 0;
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + days + " days: " + rental);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insurance = ins.calculateInsurance();
                System.out.println("Insurance: " + insurance);
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("Total Cost (Rental + Insurance): " + (rental + insurance));
            System.out.println("----------------------------------------");
        }
    }
}
