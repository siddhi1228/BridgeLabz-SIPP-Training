package Java_Inheritance;

public class Book {
	String title;
	int publicationYear;
	Book(String title,int publicationYear)
	{
		this.title=title;
		this.publicationYear=publicationYear;
	}
	void displayInfo()
	{
		System.out.println("Title:"+title);
		System.out.println("Publication Year:"+publicationYear);
	}
}
class Author extends Book {
	String title;
	int publicationYear;
	String author,bio;
	Author(String title,int publicationYear,String author,String bio)
	{
		super(title,publicationYear);
		this.author=author;
		this.bio=bio;
	}
	void displayInfo()
	{
		System.out.println("Author:"+author);
		System.out.println("Bio:"+bio);
		super.displayInfo();
	}
}
class Library {
	public static void main(String args[])
	{
		Book a1 = new Author("Harry Potter",1997,"JK Rowling","British author and philanthropist");
		a1.displayInfo();
		
		Book a2 = new Author("Metamorphosis",1915,"Franz Kafka","Novelist and writer");
		a2.displayInfo();
	}
}
