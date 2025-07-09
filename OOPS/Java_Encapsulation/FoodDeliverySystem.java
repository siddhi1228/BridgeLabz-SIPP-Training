package Java_Encapsulation;

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 50) {
            this.discount = percentage;
        }
    }

    public String getDiscountDetails() {
        return "Veg Discount: " + discount + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private final double nonVegCharge = 20;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double base = (getPrice() + nonVegCharge) * getQuantity();
        return base - (base * discount / 100);
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 30) {
            this.discount = percentage;
        }
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount + "%";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[3];

        VegItem v1 = new VegItem("Paneer Butter Masala", 180, 2);
        v1.applyDiscount(10);

        NonVegItem nv1 = new NonVegItem("Chicken Biryani", 250, 1);
        nv1.applyDiscount(15);

        VegItem v2 = new VegItem("Dal Fry", 100, 3);
        v2.applyDiscount(5);

        order[0] = v1;
        order[1] = nv1;
        order[2] = v2;

        processOrder(order);
    }

    public static void processOrder(FoodItem[] items) {
        double grandTotal = 0;

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: ₹" + total);
            grandTotal += total;
            System.out.println("-----------------------------");
        }

        System.out.println("Grand Total: ₹" + grandTotal);
    }
}
