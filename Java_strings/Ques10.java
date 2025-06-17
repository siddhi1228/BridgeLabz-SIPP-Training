package Java_strings;

import java.util.*;

public class Ques10 {

    static void generateException(String text) {
        Integer.parseInt(text);             // may explode
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number = " + num);
        } catch (NumberFormatException nfe) {
            System.out.println("Handled NumberFormatException → " + nfe);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something that might be a number: ");
        String text = sc.nextLine();

        try { generateException(text); } catch (RuntimeException ignored) {}
        handleException(text);
        sc.close();
    }
}

