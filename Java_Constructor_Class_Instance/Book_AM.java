package Java_Constructor_Class_Instance;

class Book_AM {
 public String ISBN;
 protected String title;
 private String author;

 public Book_AM(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public void displayBookInfo() {
     System.out.println("ISBN: " + ISBN);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
 }
}

//EBook.java
class EBook extends Book_AM {
 private double fileSizeMB;

 public EBook(String ISBN, String title, String author, double fileSizeMB) {
     super(ISBN, title, author);
     this.fileSizeMB = fileSizeMB;
 }

 public void displayEBookInfo() {
     System.out.println("E-Book Details:");
     System.out.println("ISBN (public): " + ISBN);        // public access
     System.out.println("Title (protected): " + title);   // protected access
     System.out.println("File Size: " + fileSizeMB + " MB");
 }
}

class Check1 {
 public static void main(String[] args) {
     Book_AM b1 = new Book_AM("978-0134685991", "Effective Java", "Joshua Bloch");
     b1.displayBookInfo();

     System.out.println();

     EBook e1 = new EBook("978-0132350884", "Clean Code", "Robert C. Martin", 2.5);
     e1.displayEBookInfo();

     System.out.println();

     System.out.println("Original Author: " + e1.getAuthor());
     e1.setAuthor("Uncle Bob");
     System.out.println("Updated Author: " + e1.getAuthor());
 }
}


