import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert (1) Celsius to Fahrenheit or (2) Fahrenheit to Celsius? ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
                break;
            case 2:
                System.out.println("Celsius: " + fahrenheitToCelsius(temp));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
