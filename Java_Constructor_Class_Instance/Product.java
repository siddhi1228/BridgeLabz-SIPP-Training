package Java_Constructor_Class_Instance;

public class Product 
{
	String productName;
	double price;
	static int totalProducts;
	
	Product()
	{
		productName="Pencil";
		price=9.5;
		totalProducts=5;
	}
	void displayIns()
	{
		System.out.println("Price of "+productName+" is "+price);
		
	}
	static void displayClss()
	{
		System.out.println("Total items are "+totalProducts);
	}
	
	public static void main(String args[])
	{
		Product p = new Product();
		p.displayIns();
		
		Product.displayClss();
	}
}
