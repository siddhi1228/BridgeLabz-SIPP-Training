package Java_keywords;

class Employee {
    static String companyName = "XYZ Corp";
    private static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }
    public static void main(String args[])
    {
    	Employee e1 = new Employee("Siddhi",12345,"Engineer");
    	e1.displayDetails();
    	Employee.displayTotalEmployees();
    	
    	Employee e2 = new Employee("Sid",45678,"Doctor");
    	e2.displayDetails();
    	Employee.displayTotalEmployees();
    }
}
