package Java_keywords;

public class Student {

    static String universityName = "ABC University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University: " + universityName);
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }

    void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated to " + newGrade + " for " + s.name);
        } else {
            System.out.println("Cannot update grade. Not a Student.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Siddhi", 101, 'A');
        Student s2 = new Student("Sid",2, 'B');

        s1.displayDetails(s1);
        System.out.println("-------------------");
        s2.displayDetails(s2);

        s2.updateGrade(s2, 'A');

        System.out.println("\nAfter grade update:");
        s2.displayDetails(s2);

        Student.displayTotalStudents();
    }
}
