package immersion.Java_Programming_Elements;
import java.util.*;
public class rounds_athelete {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1, side2, side3;
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0;
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
