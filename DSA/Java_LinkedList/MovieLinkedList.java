package Java_LinkedList;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}


public class MovieLinkedList {
	    private MovieNode head;
	    private MovieNode tail;

	    // Add at beginning
	    public void addAtBeginning(String title, String director, int year, double rating) {
	        MovieNode newNode = new MovieNode(title, director, year, rating);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    // Add at end
	    public void addAtEnd(String title, String director, int year, double rating) {
	        MovieNode newNode = new MovieNode(title, director, year, rating);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    // Add at specific position (1-based index)
	    public void addAtPosition(int position, String title, String director, int year, double rating) {
	        if (position <= 1 || head == null) {
	            addAtBeginning(title, director, year, rating);
	            return;
	        }

	        MovieNode newNode = new MovieNode(title, director, year, rating);
	        MovieNode temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            addAtEnd(title, director, year, rating);
	            return;
	        }

	        newNode.next = temp.next;
	        newNode.prev = temp;
	        temp.next.prev = newNode;
	        temp.next = newNode;
	    }

	    public void removeByTitle(String title) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        MovieNode temp = head;
	        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Movie not found.");
	            return;
	        }

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

	        System.out.println("Removed: " + title);
	    }

	    // Search by Director
	    public void searchByDirector(String director) {
	        MovieNode temp = head;
	        boolean found = false;
	        while (temp != null) {
	            if (temp.director.equalsIgnoreCase(director)) {
	                printMovie(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }
	        if (!found) System.out.println("No movies found for Director: " + director);
	    }

	    // Search by Rating
	    public void searchByRating(double rating) {
	        MovieNode temp = head;
	        boolean found = false;
	        while (temp != null) {
	            if (temp.rating == rating) {
	                printMovie(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }
	        if (!found) System.out.println("No movies found with Rating: " + rating);
	    }

	    // Update Rating by Title
	    public void updateRating(String title, double newRating) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                temp.rating = newRating;
	                System.out.println("Rating updated for " + title);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Movie not found.");
	    }

	    // Display Forward
	    public void displayForward() {
	        if (head == null) {
	            System.out.println("No movies in the list.");
	            return;
	        }
	        System.out.println("Movies (Forward):");
	        MovieNode temp = head;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.next;
	        }
	    }

	    public void displayReverse() {
	        if (tail == null) {
	            System.out.println("No movies in the list.");
	            return;
	        }
	        System.out.println("Movies (Reverse):");
	        MovieNode temp = tail;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.prev;
	        }
	    }

	    private void printMovie(MovieNode movie) {
	        System.out.println("Title: " + movie.title + ", Director: " + movie.director + ", Year: " + movie.year + ", Rating: " + movie.rating);
	    }
	}

class MovieManagement {
    public static void main(String[] args) {
        MovieLinkedList list = new MovieLinkedList();

        list.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        list.addAtPosition(2, "Parasite", "Bong Joon-ho", 2019, 8.6);

        list.displayForward();
        System.out.println();

        list.searchByDirector("Bong Joon-ho");
        list.searchByRating(8.8);

        list.updateRating("Parasite", 9.0);
        list.removeByTitle("The Godfather");

        System.out.println();
        list.displayReverse();
    }
}

