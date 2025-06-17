package control_flow;
import java.util.*;
public class Question35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double first = sc.nextInt();
        int second = sc.nextInt();
        String op = "/";
        switch (op) {
            case "+": System.out.println(first + second); break;
            case "-": System.out.println(first - second); break;
            case "*": System.out.println(first * second); break;
            case "/": System.out.println(first / second); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
