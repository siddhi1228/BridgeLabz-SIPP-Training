package methods;
import java.util.*;
public class Ques2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		simpleinterest(p,r,t);
		sc.close();
	}
	public static void simpleinterest(double p,double r,double t)
	{
		double SI = (p*r*t)/100;
		System.out.println("simple interes at Principal = "+ p+" at rate = "+ r +" at time  = "+ t + "is "+SI);
	}
}
