//Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost

package Java_Constructor_Class_Instance;

public class Car_Rental {
	String custName,carModel;
	int rentDays;
	
	Car_Rental()
	{
		custName="Siddhi";
		carModel="Hyundai";
		rentDays=5;
	}
	Car_Rental(String custName,String carModel,int rentDays)
	{
		this.custName=custName;
		this.carModel=carModel;
		this.rentDays=rentDays;
	}
	
	void display()
	{
		System.out.println("Customer :"+custName);
		System.out.println("Car Model :"+carModel);
		System.out.println("Rental Days :"+rentDays);
	}
	
	public static void main(String args[])
	{
		Car_Rental c1=new Car_Rental();
		System.out.println("Default :");
		c1.display();
		
		Car_Rental c2=new Car_Rental("Oily","Nano",2);
		System.out.println("Parameterised :");
		c2.display();
		 
	}
}
