package Java_strings;

import java.util.*;

public class Ques7 {

    static boolean equalByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String A: ");
        String a = sc.nextLine();
        System.out.print("String B: ");
        String b = sc.nextLine();

        boolean manual = equalByCharAt(a, b);
        boolean builtin = a.equals(b);

        System.out.println("Manual  : " + manual);
        System.out.println("Built‑in: " + builtin);
        sc.close();
    }
}

