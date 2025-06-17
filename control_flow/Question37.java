package control_flow;
import java.util.*;
public class Question37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int m = 0, temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println((number % sum == 0) ? "Harshad Number" : "Not a Harshad Number");
    }
}
