package methods;
import java.util.*;
public class Ques1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double deg = sc.nextDouble();
		calculateTrignometricFunctions(deg);
		sc.close();
	}
	public static void calculateTrignometricFunctions(double deg)
	{
		double rad = Math.toRadians(deg);
		double sine= Math.sin(rad);
		double cosine=Math.cos(rad);
		double tang= Math.tan(rad);
		System.out.println("sine ="+sine);
		System.out.println("cos ="+cosine);
		System.out.println("tanget ="+tang);
		
	}
}
