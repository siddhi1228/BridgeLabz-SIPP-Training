package Java_Arrays;
import java.util.*;
public class Ques13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) and weight (kg) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d => Height: %.2f, Weight: %.2f, BMI: %.2f, Status: %s", i + 1, height[i], weight[i], bmi[i], status[i]);
        }
        sc.close();
    }
}
