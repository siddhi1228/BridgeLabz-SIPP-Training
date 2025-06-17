package Java_strings;

import java.util.*;

public class Ques4 {

    static void generateException(String text) {
        char ch = text.charAt(text.length());      // SIOOBE
        System.out.println(ch);
    }

    static void handleException(String text) {
        try {
            char ch = text.charAt(text.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException se) {
            System.out.println("Caught StringIndexOutOfBoundsException → " + se);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        try { generateException(text); } catch (RuntimeException ignored) {}
        handleException(text);
        sc.close();
    }
}

