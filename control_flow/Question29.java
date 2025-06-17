package control_flow;
import java.util.*;
public class Question29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 99;
        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
