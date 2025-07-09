package Java_Constructor_Class_Instance;

public class Student {
	public int rollno;
	protected String name;
	private double cgpa;
	
	Student(int rollno,String name,double cgpa)
	{
		this.rollno = rollno;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	public double get()
	{
		return cgpa;
	}
	
	public void set(double cgpa)
	{
		if(cgpa>=0.0 && cgpa <=10.0)
		{
			this.cgpa=cgpa;
		}
		else 
			System.out.println("invalid cgpa");
	}
	
	public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostGraduate extends Student
{
	public PostGraduate(int rollno, String name,double cgpa)
	{
		super(rollno,name,cgpa);
	}
	
	 public void displayPostgraduateInfo() 
	 {
	    System.out.println("Protected Variable name");
	    System.out.println(name);
	 }
}

class Check 
{
	public static void main(String args[])
	{
		Student s = new Student(53,"Siddhi",7.8);
		s.displayStudentInfo();
		
		PostGraduate pg = new PostGraduate(54,"Oily",7.6);
		pg.displayStudentInfo();
		pg.displayPostgraduateInfo();
		
		pg.set(9.6);
		System.out.println("Updated CGPA: " + pg.get());
	}
}
