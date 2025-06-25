package Java_strings;

import java.util.*;

public class Ques9 {

    static String toUpperManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('a' <= c && c <= 'z') c = (char)(c - 32);
            sb.append(c);
        }
        return sb.toString();
    }

    static boolean equalByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual  = toUpperManual(text);
        String builtin = text.toUpperCase();

        System.out.println("Manual  : " + manual);
        System.out.println("Built‑in: " + builtin);
        System.out.println("Equal?  : " + equalByCharAt(manual, builtin));
        sc.close();
    }
}

