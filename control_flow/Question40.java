package control_flow;
import java.util.*;
public class Question40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year");
        } else if (year % 4 != 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 100 != 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
