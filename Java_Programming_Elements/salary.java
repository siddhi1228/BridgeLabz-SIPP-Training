package immersion.Java_Programming_Elements;
import java.util.*;
public class salary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary, bonus;
        salary = sc.nextInt();
        bonus = sc.nextInt();

        int income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + income);
    }
}
