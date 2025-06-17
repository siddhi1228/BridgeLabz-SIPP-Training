package immersion.Java_Programming_Elements;

public class profit_percent {
	public static void main(String args[])
	{	
		int cp = 129;
		int sp = 191;
		int p = sp-cp;
		double pp = ((double)p/cp) * 100.0; 
		System.out.println("the cost price is " + cp + " the selling price is " + sp);
		System.out.println("the profit is " + p + " the profit percent is " + pp);
	}
}

