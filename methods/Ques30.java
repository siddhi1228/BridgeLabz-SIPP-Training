package methods;

import java.util.*;

public class Ques30 {
    public static void main(String[] args) {
        int[][] employeeData = generateSalaryAndService();
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, bonusData);
    }

    public static int[][] generateSalaryAndService() {
        int[][] data = new int[10][2];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // Salary: 10000–99999
            data[i][1] = rand.nextInt(11); // Years of service: 0–10
        }
        return data;
        
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[10][2]; // [bonus, new salary]
        for (int i = 0; i < 10; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            double newSalary = data[i][0] + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tSalary\tService\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\n", i + 1, oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
            totalOld += oldData[i][0];
            totalNew += newData[i][1];
            totalBonus += newData[i][0];
        }
        System.out.printf("TOTALS:\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }
}
