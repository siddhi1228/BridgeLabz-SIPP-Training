package Java_keywords;
public class Patient {

    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    private static int idCounter = 1001;

    Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = idCounter++;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Siddhi", 25, "Fever");
        Patient p2 = new Patient("Riya", 30, "Fracture");

        p1.displayDetails(p1);
        System.out.println("-------------------");
        p2.displayDetails(p2);

        getTotalPatients();
    }
}
