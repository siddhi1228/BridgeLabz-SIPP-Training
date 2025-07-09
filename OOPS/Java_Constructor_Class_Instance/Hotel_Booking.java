//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

package Java_Constructor_Class_Instance;

public class Hotel_Booking {
	String guestName;
    String roomType;
    int night;

    // Default Constructor
    Hotel_Booking() {
        guestName = "Guest";
        roomType = "Double";
        night = 1;
    }

    // Parameterized Constructor
    Hotel_Booking(String guestName, String roomType, int night) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    }

    // Copy Constructor
    Hotel_Booking(Hotel_Booking prevBooking) {
        this.guestName = prevBooking.guestName;
        this.roomType = prevBooking.roomType;
        this.night = prevBooking.night;
       
    }


    // Display Order Details
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Night: " + night);
    }
    
    public static void main(String[] args) {
        // Default Constructor
    	Hotel_Booking h1 = new Hotel_Booking();
        System.out.println("Booking 1:");
        h1.display();

        // Parameterized Constructor
        Hotel_Booking h2 = new Hotel_Booking("Alice", "Single", 3);
        System.out.println("\nBooking 2:");
        h2.display();

        // Copy Constructor
        Hotel_Booking h3 = new Hotel_Booking(h2);
        System.out.println("\nBooking 3 (Copy of Order 2):");
        h3.display();
    }
}


