package GENERICS.Regix_And_JUnit.Regix_Practice;

public class ValidateCreditCard {
    public static boolean isValidCreditCard(String number) {
        return number.matches("^(4\\d{15}|5\\d{15})$");
    }

    public static void main(String[] args) {
        System.out.println(isValidCreditCard("4123456789012345"));
        System.out.println(isValidCreditCard("5123456789012345"));
        System.out.println(isValidCreditCard("6123456789012345"));
        System.out.println(isValidCreditCard("4123456789"));
    }
}

