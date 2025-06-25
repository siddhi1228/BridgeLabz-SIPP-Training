//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.

package Java_Constructor_Class_Instance;

public class Lib_Book {

	    String title;
	    String author;
	    double price;
	    boolean isAvailable;

	    // Default constructor
	    Lib_Book() {
	        title = "Unknown";
	        author = "Unknown";
	        price = 0.0;
	        isAvailable = true;
	    }

	    // Parameterized constructor
	    Lib_Book(String title, String author, double price, boolean isAvailable) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.isAvailable = isAvailable;
	    }

	    // Method to display book details
	    void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: Rs. " + price);
	        if(isAvailable==true)
	        System.out.println("Available ");
	        else 
	        System.out.println("Not Available ");
	    }

	    // Method to borrow a book
	    public static void main(String args[])
	    {
	    	Lib_Book l1 = new Lib_Book();
	    	l1.display();
	    	
	    	Lib_Book l2 = new Lib_Book("Harry Potter","JK Rowling",200.0,false);
	    	l2.display();
	   
	    }

}
