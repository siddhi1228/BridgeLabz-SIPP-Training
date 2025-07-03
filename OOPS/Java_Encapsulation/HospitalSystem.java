package Java_Encapsulation;

import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 5000; // base treatment charge
    }

    public void addRecord(String record) {
        records.add(record);
        addToHistory(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
        addToHistory(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];

        InPatient inpatient = new InPatient("P001", "Alice", 35, "Appendicitis", 3, 2000);
        inpatient.addRecord("Appendix surgery performed.");
        inpatient.addRecord("Post-surgery antibiotics given.");

        OutPatient outpatient = new OutPatient("P002", "Bob", 28, "Fever", 500);
        outpatient.addRecord("Fever diagnosed.");
        outpatient.addRecord("Paracetamol prescribed.");

        patients[0] = inpatient;
        patients[1] = outpatient;

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Medical History:");
            for (String record : p.getMedicalHistory()) {
                System.out.println("- " + record);
            }
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("-----------------------------");
        }
    }
}
