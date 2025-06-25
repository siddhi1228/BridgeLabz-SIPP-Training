//Create a Person class with a copy constructor that clones another person's attributes.

package Java_Constructor_Class_Instance;

public class Person {
	String name;
	Double height,weight;
	int age;
	char gender;
	Person(String name, Double height,Double weight,int age,char gender)
	{
		this.name=name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
	}
	Person(Person prevPerson)
	{
		this.name=prevPerson.name;
		this.height = prevPerson.height;
		this.weight = prevPerson.weight;
		this.age = prevPerson.age;
		this.gender = prevPerson.gender;
	}
	
	void display()
	{
		System.out.println("height :"+height);
		System.out.println("weight :"+weight);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
	}
	
	public static void main(String args[]) {
		Person p1 = new Person("Yug",177.5,78.2,24,'f');
		System.out.println("Person1");
		p1.display();
		
		Person p2 = new Person(p1);
		System.out.println("Copy of Person1");
		p2.display();
	}
}
