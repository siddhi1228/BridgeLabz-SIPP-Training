package control_flow;
import java.util.*;
public class Question34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        String grade = (percentage >= 90) ? "A" : (percentage >= 75) ? "B" : (percentage >= 50) ? "C" : "F";
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
