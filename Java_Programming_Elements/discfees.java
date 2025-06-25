package immersion.Java_Programming_Elements;
import java.util.*;
public class discfees {
	public static void main(String args[])
	{	
		int chrg = 125000;
		int d = 10;
		double dp = 0.1 * chrg;
		double fin = chrg - dp;
		System.out.println("the discount amount is " + dp + " the discounted fee is " + fin);
	}
}
