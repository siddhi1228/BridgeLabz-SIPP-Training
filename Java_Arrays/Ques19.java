package Java_Arrays;
import java.util.*;
public class Ques19 {
	public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        double[] salary = new double[10];
        int[] service = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years of service for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            int yrs = sc.nextInt();
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input, re-enter.");
                i--;
                continue;
            }
            salary[i] = sal;
            service[i] = yrs;
            bonus[i] = (yrs > 5) ? 0.05 * sal : 0.02 * sal;
            newSalary[i] = sal + bonus[i];
            totalBonus += bonus[i];
            totalOld += sal;
            totalNew += newSalary[i];
        }
        System.out.printf("Total Bonus: %.2f Total Old Salary: %.2f Total New Salary: %.2f", totalBonus, totalOld, totalNew);
        sc.close();
    }
}
