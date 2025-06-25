package immersion.Java_Programming_Elements;
import java.util.*;
public class pnds_kg {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = sc.nextDouble();

        double kilograms = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
    }
}
