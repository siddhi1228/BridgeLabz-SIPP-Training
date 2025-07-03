package Java_Encapsulation;
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;
    private boolean isReserved = false;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrower() {
        return borrower;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    protected void setReserved(boolean reserved) {
        this.isReserved = reserved;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 21;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved();
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        items[1] = new Magazine("M001", "National Geographic", "Various Authors");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration (days): " + item.getLoanDuration());

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("John Doe");
                } else {
                    System.out.println("Item not available for reservation.");
                }
            }

            System.out.println("-------------------------------");
        }
    }
}
