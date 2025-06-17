package Java_Arrays;
import java.util.*;
public class Ques16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid mark, please re-enter.");
                    j--;
                }
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = (percentage[i] >= 90) ? 'A' : (percentage[i] >= 80) ? 'B' : (percentage[i] >= 70) ? 'C' : (percentage[i] >= 60) ? 'D' : 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d => Percentage: %.2f%%, Grade: %c", i + 1, percentage[i], grade[i]);
        }
        sc.close();
    }
}
