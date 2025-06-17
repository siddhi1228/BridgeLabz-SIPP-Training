package immersion.Java_Programming_Elements;
import java.util.*;
public class Area_triangle {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble(); 
		double h = sc.nextDouble(); 
		double acm = 1/2.0 * b * h;
		double ain = acm/(2.54*2.54);
		System.out.println("the area in centimeter is " + acm + " the area in inches is " + ain);
	}
}
