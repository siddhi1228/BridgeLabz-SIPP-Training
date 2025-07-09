package Java_Encapsulation;

interface Department {
 void assignDepartment(String departmentName);
 String getDepartmentDetails();
}

abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: " + baseSalary);
 }
}

class FullTimeEmployee extends Employee implements Department {
 private String departmentName;
 private double fixedBonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
     super(employeeId, name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + fixedBonus;
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.departmentName = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Full-Time Department: " + departmentName;
 }
}

//PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
 private String departmentName;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
     super(employeeId, name, baseSalary);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + (hoursWorked * hourlyRate);
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.departmentName = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Part-Time Department: " + departmentName;
 }
}

class EmployeeManagementSystem {
 public static void main(String[] args) {
     Employee[] employees = new Employee[2];

     FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 30000, 5000);
     fte.assignDepartment("Engineering");

     PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 10000, 20, 500);
     pte.assignDepartment("Support");

     employees[0] = fte;
     employees[1] = pte;

     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println("Calculated Salary: " + emp.calculateSalary());

         if (emp instanceof Department) {
             Department dept = (Department) emp;
             System.out.println(dept.getDepartmentDetails());
         }

     }
 }
}
