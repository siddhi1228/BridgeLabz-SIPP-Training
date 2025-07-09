package Java_Inheritance;
class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
        System.out.println();
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped - Tracking #: " + trackingNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Displays common info
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: " + getOrderStatus());
        System.out.println();
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: " + getOrderStatus());
        System.out.println();
    }
}
class OrderManagement {
    public static void main(String[] args) {
        Order basicOrder = new Order("ORD1001", "2025-07-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD1002", "2025-07-01", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD1003", "2025-07-01", "TRK789123", "2025-07-02");

        basicOrder.displayDetails();
        shippedOrder.displayDetails();
        deliveredOrder.displayDetails();
    }
}


