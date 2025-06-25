package Java_strings;

import java.util.*;

public class Ques15 {

    static int lengthManual(String s) {
        int len = 0;
        try {
            while (true) { s.charAt(len); len++; }
        } catch (StringIndexOutOfBoundsException ignored) { }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String text = sc.nextLine();

        int manual  = lengthManual(text);
        int builtin = text.length();

        System.out.println("Manual length  : " + manual);
        System.out.println("Built‑in length: " + builtin);
        sc.close();
    }
}

