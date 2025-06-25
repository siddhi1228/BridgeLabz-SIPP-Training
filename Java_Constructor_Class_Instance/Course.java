package Java_Constructor_Class_Instance;

public class Course 
{
		String courseName;
		double fee;
		int duration;
		static String instituteName;
		
		
		Course()
		{
			courseName="AIML";
			fee=106500.0;
			duration=4;
			instituteName="GLA University";
		}
		void displayIns()
		{
			System.out.println("Fees of "+courseName+" is "+fee+" for "+duration+" years");
			
		}
		static void displayClss()
		{
			System.out.println("Institute : "+instituteName);
		}
		
		public static void main(String args[])
		{
			Course c = new Course();
			c.displayIns();
			
			Course.displayClss();
		}
}
