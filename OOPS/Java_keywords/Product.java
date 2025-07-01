package Java_keywords;

public class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;
    private static int idCounter = 1001;
    Product(String productName, double price, int quantity) {
        this.productID = idCounter++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    double calculateTotalPrice() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    // 4. Use instanceof to validate object type before displaying details
    void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: " + p.calculateTotalPrice());
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1);
        Product p2 = new Product("Mouse", 1000, 2);

        p1.displayProductDetails(p1);
        System.out.println("-------------------");
        p2.displayProductDetails(p2);
        Product.updateDiscount(20.0);

        System.out.println("\nAfter updating discount:\n");
        p1.displayProductDetails(p1);
    }
}
