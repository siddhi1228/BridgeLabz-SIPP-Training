package Java_Arrays;
import java.util.*;
public class Ques15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height and weight for person " + (i + 1) + ": ");
            double h = sc.nextDouble();
            double w = sc.nextDouble();
            if (h <= 0 || w <= 0) {
                System.out.println("Enter positive values.");
                i--;
                continue;
            }
            data[i][0] = h;
            data[i][1] = w;
            data[i][2] = w / (h * h);
            if (data[i][2] < 18.5) status[i] = "Underweight";
            else if (data[i][2] < 25) status[i] = "Normal";
            else if (data[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d => Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s", i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
        sc.close();
    }
}
