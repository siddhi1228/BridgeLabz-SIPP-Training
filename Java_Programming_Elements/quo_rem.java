package immersion.Java_Programming_Elements;
import java.util.*;
public class quo_rem {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int q = n1/n2;
		int r = n1%n2;
		System.out.println("the quotient is " + q + " the remainder is " + r);
		
	}
}
