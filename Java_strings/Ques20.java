package Java_strings;

import java.util.*;

public class Ques20 {

    static int lengthManual(String s) {
        int len = 0;
        try { while (true) { s.charAt(len); len++; } }
        catch (StringIndexOutOfBoundsException ignored) { }
        return len;
    }

    static String[] splitByCharAt(String text) {
        int spaces = 1;
        for (char c : text.toCharArray()) if (c == ' ') spaces++;
        String[] words = new String[spaces];
        int start = 0, w = 0;
        for (int i = 0; i <= lengthManual(text); i++) {
            if (i == lengthManual(text) || text.charAt(i) == ' ') {
                words[w++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static boolean arraysEqual(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();

        String[] manual  = splitByCharAt(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual  = " + Arrays.toString(manual));
        System.out.println("Built‑in= " + Arrays.toString(builtin));
        System.out.println("Equal?  = " + arraysEqual(manual, builtin));
        sc.close();
    }
}

