package control_flow;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial is: " + fact);
        sc.close();
        
    }
}
