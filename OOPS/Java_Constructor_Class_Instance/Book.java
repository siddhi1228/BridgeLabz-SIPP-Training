//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

package Java_Constructor_Class_Instance;

class Book {
    String title, author;
    int price;

    // Default constructor
    Book() {
        title = "null";
        author = "null";
        price = 0;
    }

    // Parameterized constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

 class Main {
    public static void main(String args[]) {
        // Default constructor
        Book b1 = new Book();
        System.out.println("Book 1");
        b1.display();

        // Parameterized constructor
        Book b2 = new Book("Harry Potter", "JK Rowling", 200);
        System.out.println("\nBook 2");
        b2.display(); // fixed here
    }
}
