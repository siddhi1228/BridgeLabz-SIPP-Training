package Java_Generics02;
import java.util.*;

public class ShoppingCart {
    // HashMap to store product prices
    private static final Map<String, Double> productPrices = new HashMap<>();
    
    // LinkedHashMap to maintain order of items added to cart
    private static final LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    static {
        // Adding products and prices
        productPrices.put("Apple", 1.99);
        productPrices.put("Banana", 0.99);
        productPrices.put("Milk", 2.49);
        productPrices.put("Bread", 1.49);
        productPrices.put("Cheese", 3.99);
    }

    public static void main(String[] args) {
        // Add items to the cart
        addToCart("Milk", 2);
        addToCart("Apple", 5);
        addToCart("Banana", 3);
        addToCart("Cheese", 1);
        addToCart("Bread", 1);

        System.out.println("🛒 Cart (in order of adding):");
        showCartInInsertionOrder();

        System.out.println("\n🧾 Cart (sorted by price):");
        showCartSortedByPrice();

        System.out.println("\n💰 Total Price: ₹" + String.format("%.2f", calculateTotal()));
    }

    public static void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("❌ Product not found: " + product);
        }
    }

    public static void showCartInInsertionOrder() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            System.out.println(product + " x " + quantity + " = ₹" + String.format("%.2f", price * quantity));
        }
    }

    public static void showCartSortedByPrice() {
        // TreeMap to sort items by price (value)
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (String product : cart.keySet()) {
            double price = productPrices.get(product);
            sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        }

        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            double price = entry.getKey();
            for (String product : entry.getValue()) {
                int quantity = cart.get(product);
                System.out.println(product + " x " + quantity + " = ₹" + String.format("%.2f", price * quantity));
            }
        }
    }

    public static double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }
}
