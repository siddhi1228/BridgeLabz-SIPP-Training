package Java_strings;

import java.util.*;

public class Ques14 {

    static int[] findTrimBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ')   end--;
        return new int[]{start, end + 1};              // end is exclusive
    }

    static String substringByCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(s.charAt(i));
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
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] bounds = findTrimBounds(text);
        String manual  = substringByCharAt(text, bounds[0], bounds[1]);
        String builtin = text.trim();

        System.out.println("Manual  : >" + manual + "<");
        System.out.println("Built‑in: >" + builtin + "<");
        System.out.println("Equal?  : " + equalByCharAt(manual, builtin));
        sc.close();
    }
}

