package control_flow;
import java.util.*;
public class Question31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println((sum == original) ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
