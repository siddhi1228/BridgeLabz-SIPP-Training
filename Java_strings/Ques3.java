package Java_strings;

import java.util.*;

public class Ques3 {

    static void generateException(String[] names) {
        // Force an index beyond the array length
        System.out.println(names[names.length]);  // AEIOOBE
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException abe) {
            System.out.println("Caught ArrayIndexOutOfBoundsException → " + abe);
        } catch (RuntimeException re) {
            System.out.println("Caught RuntimeException → " + re);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names? ");
        int n = sc.nextInt(); sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try { generateException(names); } catch (RuntimeException ignored) {}
        handleException(names);
        sc.close();
    }
}

