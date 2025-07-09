package Java_Inheritance;

class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("Thermostat Device:");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println();
    }
}

class SmartHome {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("THERMO123", "ON", 24.5);
        Thermostat t2 = new Thermostat("THERMO456", "OFF", 20.0);

        t1.displayStatus();
        t2.displayStatus();
    }
}

