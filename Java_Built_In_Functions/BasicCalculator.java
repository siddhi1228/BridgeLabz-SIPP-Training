import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose operation (add, subtract, multiply, divide): ");
        String operation = scanner.nextLine();

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        switch (operation.toLowerCase()) {
            case "add" -> System.out.println("Result: " + add(a, b));
            case "subtract" -> System.out.println("Result: " + subtract(a, b));
            case "multiply" -> System.out.println("Result: " + multiply(a, b));
            case "divide" -> {
                double result = divide(a, b);
                System.out.println(Double.isNaN(result) ? "Error: Division by zero!" : "Result: " + result);
            }
            default -> System.out.println("Invalid operation.");
        }
    }
}
