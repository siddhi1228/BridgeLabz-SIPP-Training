package Java_LinkedList;

public class OnlineTicketLinkedList {

    static class TicketNode {
        int ticketId;
        String customerName;
        String movieName;
        String seatNumber;
        String bookingTime;
        TicketNode next;

        public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
        }
    }

    private TicketNode head = null;
    private TicketNode tail = null;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            newTicket.next = head;
            tail = newTicket;
        }
        System.out.println("🎫 Ticket booked for " + customerName + " (" + movieName + ")");
    }

    public void removeTicketById(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to cancel.");
            return;
        }

        TicketNode current = head, prev = tail;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                if (current == head) {
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("❌ Ticket ID " + ticketId + " cancelled.");
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Ticket ID " + ticketId + " not found.");
        }
    }

    public void displayAllTickets() {
        if (head == null) {
            System.out.println("🎟️ No booked tickets.");
            return;
        }

        System.out.println("📋 Booked Tickets:");
        TicketNode temp = head;
        do {
            System.out.println("→ Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("🎯 Found Ticket: ID " + temp.ticketId + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No ticket found for customer: " + customerName);
    }

    public void searchByMovie(String movieName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("🎯 Found Ticket: ID " + temp.ticketId + ", Customer: " + temp.customerName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tickets found for movie: " + movieName);
    }

    public void countTotalTickets() {
        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("🎟️ Total Booked Tickets: " + count);
    }

    public static void main(String[] args) {
    	OnlineTicketLinkedList system = new OnlineTicketLinkedList();

        system.addTicket(101, "Alice", "Avengers", "A1", "6:00 PM");
        system.addTicket(102, "Bob", "Inception", "B2", "7:30 PM");
        system.addTicket(103, "Charlie", "Avengers", "C3", "6:00 PM");

        system.displayAllTickets();
        system.searchByCustomer("Alice");
        system.searchByMovie("Avengers");

        system.removeTicketById(102);
        system.displayAllTickets();

        system.countTotalTickets();
    }
}
