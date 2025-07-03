package Java_Inheritance;

public class Employee {
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Salary:"+salary);
	}
}
class Manager extends Employee
{
	String name;
	int id;
	double salary;
	int teamSize;
	Manager(String name,int id,double salary)
	{
		super(name,id,salary);
		teamSize=5;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Team Size: "+teamSize);
	}
}
class Developer extends Employee
{
	String name;
	int id;
	double salary;
	String programmingLang;
	Developer(String name,int id,double salary)
	{
		super(name,id,salary);
		programmingLang="Java";
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language: "+programmingLang);
	}
}
class Intern extends Employee
{
	String name;
	int id;
	double salary;
	int age;
	Intern(String name,int id,double salary)
	{
		super(name,id,salary);
		age=21;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Age: "+age);
	}
}
class Office
{
	public static void main(String args[])
	{
		Employee m = new Manager("Akshat",12345,60000.0);
		m.displayDetails();
		
		Employee d = new Developer("Sia",34567,50000.0);
		d.displayDetails();
		
		Employee i = new Intern("Lmao",77765,25000.0);
		i.displayDetails();
	}
}