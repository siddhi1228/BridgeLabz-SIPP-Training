package methods;

public class Ques23 {
    public static void main(String[] args) {
        System.out.println("98.6 F to Celsius: " + convertFahrenheitToCelsius(98.6));
        System.out.println("37 C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("120 pounds to kg: " + convertPoundsToKilograms(120));
        System.out.println("55 kg to pounds: " + convertKilogramsToPounds(55));
        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
