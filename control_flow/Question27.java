package control_flow;
import java.util.*;
public class Question27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double salary = sc.nextInt();
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
