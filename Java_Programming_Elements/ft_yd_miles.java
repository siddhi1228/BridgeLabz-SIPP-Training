package immersion.Java_Programming_Elements;
import java.util.*;
public class ft_yd_miles {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextDouble();  
		double yard = feet/3.0;
		double mile = yard/1760.0;
		System.out.println("the distance in yard is " + yard + " the distance in miles is " + mile);
	}
}
