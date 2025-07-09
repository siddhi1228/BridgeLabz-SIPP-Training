package Java_Inheritance;

public class Animal {
	String name;
	int age;
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void makeSound()
	{
		System.out.println(name+" makes sound at age of "+age);
	}
}
class Dog extends Animal {
	Dog(String name,int age)
	{
		super(name,age);
	}
	public void makeSound()
	{
		System.out.println(name+" barks at age of "+age);
	}
}
class Cat extends Animal{
	Cat(String name,int age)
	{
		super(name,age);
	}
	public void makeSound()
	{
		System.out.println(name+" meows at age of "+age);
	}
}
class Bird extends Animal{
	Bird(String name,int age)
	{
		super(name,age);
	}
	public void makeSound()
	{
		System.out.println(name+" meows at age of "+age);
	}
}
class XYZ
{
	public static void main(String args[]) 
	{
		Dog d = new Dog("Kutta",10);
		d.makeSound();
		
		Cat c = new Cat("Billi",8);
		c.makeSound();
		
		Bird b = new Bird("Chidiya",1);
		b.makeSound();
	}
}