package control_flow;
import java.util.*;
public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int formula = n * (n + 1) / 2;
        System.out.println("Sum using loop: " + sum);
        System.out.println("Sum using formula: " + formula);
        System.out.println("Results match? " + (sum == formula));
        sc.close();
        }
}
