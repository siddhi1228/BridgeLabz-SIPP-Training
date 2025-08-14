package GENERICS.Regix_And_JUnit.Regix_Practice;

public class ValidateIPv4 {
    public static boolean isValidIPv4(String ip) {
        return ip.matches("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.0.1"));
        System.out.println(isValidIPv4("256.100.50.25"));
    }
}
