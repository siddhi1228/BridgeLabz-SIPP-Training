package control_flow;
import java.util.*;
public class Question39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble(); 
        double height = sc.nextDouble();
        height = height / 100; // convert to meters
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
