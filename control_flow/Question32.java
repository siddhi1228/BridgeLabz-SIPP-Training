package control_flow;
import java.util.*;
public class Question32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is Prime" : " is Not Prime"));
    }
}
