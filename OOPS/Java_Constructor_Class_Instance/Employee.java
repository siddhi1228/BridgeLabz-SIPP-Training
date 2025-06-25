package Java_Constructor_Class_Instance;

class Employee {
 public int employeeID;
 protected String department;
 private double salary;

 public Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 public void setSalary(double newSalary) {
     if (newSalary >= 0) {
         this.salary = newSalary;
     } else {
         System.out.println("Invalid salary amount!");
     }
 }

 public double getSalary() {
     return salary;
 }

 // Display employee info
 public void displayEmployeeInfo() {
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Department: " + department);
     System.out.println("Salary: " + salary);
 }
}

class Manager extends Employee {
 private String teamName;

 public Manager(int employeeID, String department, double salary, String teamName) {
     super(employeeID, department, salary);
     this.teamName = teamName;
 }

 
 public void displayManagerInfo() {
     System.out.println("Manager Info:");
     System.out.println("Employee ID (public): " + employeeID);  
     System.out.println("Department (protected): " + department);
     System.out.println("Team Name: " + teamName);
 }
}

class Check3 {
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Engineering", 50000);
     emp.displayEmployeeInfo();

     System.out.println();

     Manager mgr = new Manager(201, "Sales", 75000, "Alpha Team");
     mgr.displayManagerInfo();

     // Accessing and modifying salary through public method
     System.out.println("Current Salary: " + mgr.getSalary());
     mgr.setSalary(80000);
     System.out.println("Updated Salary: " + mgr.getSalary());
 }
}
