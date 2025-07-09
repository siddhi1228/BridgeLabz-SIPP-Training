package Java_Constructor_Class_Instance;

public class Vehicle 
{
		String ownerName,vehicleType;
		static double registrationFee;
		
		
		Vehicle()
		{
			ownerName="Siddhi";
			vehicleType="Car";
			registrationFee=5000.0;
		}
		void displayVehicleDetails()
		{
			System.out.println("Name of owner is "+ownerName+" has vehicle "+vehicleType);
			
		}
		static void updateRegistrationFee()
		{
			System.out.println("Registration Fee"+registrationFee);
		}
		
		public static void main(String args[])
		{
			Vehicle v = new Vehicle();
			
			v.displayVehicleDetails();
			
			Vehicle.updateRegistrationFee();
		}
}

