package Java_Inheritance;

interface Refuelable {
    void refuel();
}

class VehicleManagement {
    int maxSpeed;
    String model;

    public VehicleManagement(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends VehicleManagement {
    int batteryCapacity; // in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
    }

    public void showInfo() {
        System.out.println("Electric Vehicle:");
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        charge();
        System.out.println();
    }
}

class PetrolVehicle extends VehicleManagement implements Refuelable {
    int fuelTankCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
    }

    public void showInfo() {
        System.out.println("Petrol Vehicle:");
        displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        refuel();
        System.out.println();
    }
}

class MainVehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 40);

        ev.showInfo();
        pv.showInfo();
    }
}

