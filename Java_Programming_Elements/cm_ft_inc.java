package immersion.Java_Programming_Elements;
import java.util.*;
public class cm_ft_inc {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
		double inch = cm/2.54;
		double foot = inch/12; 
		System.out.println("the height in centtimeter is " + cm + "  in feet is " + foot + " in inches is " + inch);
	}
}
