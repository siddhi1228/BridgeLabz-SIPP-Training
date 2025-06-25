//Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

package Java_Constructor_Class_Instance;

import java.util.*;

public class Circle {
	double radius;
	Circle()
	{
		radius=0.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	void display()
	{
		System.out.println("radius="+radius);
	}
	public static void main(String args[]) {
		Circle c1 = new Circle();
		System.out.println("Default radius");
		c1.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("User enter radius:");
		double r = sc.nextDouble();
		
		Circle c2 = new Circle(r);
		System.out.println("User given radius");
		c2.display();
		
		sc.close();
	}
	
}


