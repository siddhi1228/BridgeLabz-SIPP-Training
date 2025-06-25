package Java_Arrays;
import java.util.*;
public class Ques10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int index = 0;
        double total = 0.0;
        while (true) {
            System.out.print("Enter number: ");
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            arr[index++] = val;
        }
        for (int i = 0; i < index; i++) total += arr[i];
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) System.out.print(arr[i] + " ");
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
