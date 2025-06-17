package immersion.Java_Programming_Elements;
import java.util.*;
public class basic_calc {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double add = n1+n2;
		double sub = n1-n2;
		double mul = n1*n2;
		double div = n1/n2;
		System.out.println("the addition is " + add + "the subtraction is " + sub + " the multiplication is " + mul + " the division is " + div);
		sc.close();
	}
}
