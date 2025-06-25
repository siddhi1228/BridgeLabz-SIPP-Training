package Java_Arrays;
import java.util.*;
public class Ques17 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            double total = 0;
            for (String subject : new String[]{"Physics", "Chemistry", "Maths"}) {
                System.out.print("Enter marks for " + subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Invalid mark. Re-enter.");
                    subject = subject; // Re-ask
                    continue;
                }
                total += mark;
            }
            percentage[i] = total / 3.0;
            grade[i] = (percentage[i] >= 90) ? 'A' : (percentage[i] >= 80) ? 'B' : (percentage[i] >= 70) ? 'C' : (percentage[i] >= 60) ? 'D' : 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d => Percentage: %.2f%%, Grade: %c", i + 1, percentage[i], grade[i]);
        }
        sc.close();
    }
}
