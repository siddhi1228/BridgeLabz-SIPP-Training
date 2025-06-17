package immersion.Java_Programming_Elements;
import java.util.*;
public class feesdisc_user {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int fees = sc.nextInt();
		double dp = sc.nextDouble(); 
		double d = fees*dp/100.0;
		double df = fees - d;
		System.out.println("the discount price is " + d + " price after discount is " + df);
	}
}
