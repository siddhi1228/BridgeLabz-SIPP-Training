package Java_LinkedList;

public class LibraryLinkedList {

    static class BookNode {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        BookNode next, prev;

        public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    private BookNode head = null, tail = null;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 1 || head == null) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) temp = temp.next;

        if (temp.next == null) {
            addAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void removeByBookId(int bookId) {
        if (head == null) return;

        BookNode temp = head;
        while (temp != null && temp.bookId != bookId) temp = temp.next;

        if (temp == null) return;

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book with title '" + title + "' not found.");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No books found by author '" + author + "'.");
    }

    public void updateAvailability(int bookId, boolean newStatus) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                System.out.println("Availability updated for Book ID: " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode temp = head;
        System.out.println("Library (Forward):");
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode temp = tail;
        System.out.println("Library (Reverse):");
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books in library: " + count);
    }

    private void printBook(BookNode book) {
        System.out.println("ID: " + book.bookId + ", Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre + ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
    	LibraryLinkedList lib = new LibraryLinkedList();

        lib.addAtBeginning("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true);
        lib.addAtEnd("1984", "George Orwell", "Dystopia", 102, false);
        lib.addAtPosition(2, "Harry Potter", "J.K. Rowling", "Fantasy", 103, true);

        lib.displayForward();
        lib.displayReverse();

        lib.searchByTitle("Harry Potter");
        lib.searchByAuthor("George Orwell");

        lib.updateAvailability(102, true);

        lib.removeByBookId(101);
        lib.displayForward();

        lib.countBooks();
    }
}

