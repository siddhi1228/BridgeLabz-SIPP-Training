package Java_Encapsulation;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle2 {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle2(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    protected String getCurrentLocation() {
        return currentLocation;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: ₹" + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

class Cars extends Vehicle2 implements GPS {
    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base fee for car
    }

    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Bikes extends Vehicle2 implements GPS {
    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base fee
    }

    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Auto extends Vehicle2 implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // small base fee
    }

    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class RideHailingApp {
    public static void main(String[] args) {
        Vehicle2[] rides = new Vehicle2[3];

        Cars car = new Cars("CAR101", "Alice", 15);
        car.updateLocation("Downtown");

        Bikes bike = new Bikes("BIKE202", "Bob", 8);
        bike.updateLocation("Central Park");

        Auto auto = new Auto("AUTO303", "Charlie", 10);
        auto.updateLocation("Mall Road");

        rides[0] = car;
        rides[1] = bike;
        rides[2] = auto;

        processRides(rides, 12.5);
    }

    public static void processRides(Vehicle2[] vehicles, double distance) {
        System.out.println("Fare estimation for distance: " + distance + " km");
        for (Vehicle2 v : vehicles) {
            System.out.println(v.getVehicleDetails());
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println("Estimated Fare: ₹" + v.calculateFare(distance));
            System.out.println("-------------------------------------");
        }
    }
}

