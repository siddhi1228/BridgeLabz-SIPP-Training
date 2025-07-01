package Java_keywords;

public class Book {
	static String libraryName="XYZ";
	String title,author;
	final int isbn;
	Book(String title,String author,int isbn)
	{
		this.author=author;
		this.isbn=isbn;
		this.title=title;
	}
	static void displayLibraryName()
	{
		System.out.println("Library "+libraryName);
	}
	void display()
	{
		if(this instanceof Book)
		{
			System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
		}
	}
	public static void main(String[] args) {
		Book b = new Book("Harry Potter", "JK Rowling",12345);
		b.display();
		Book.displayLibraryName();
	}
}
