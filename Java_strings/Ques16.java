package Java_strings;

import java.util.*;

public class Ques16 {

    static String[] splitByCharAt(String text) {
        int spaces = 1;
        for (char c : text.toCharArray()) if (c == ' ') spaces++;
        String[] words = new String[spaces];
        int start = 0, w = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[w++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static int lengthManual(String s) {
        int len = 0;
        try { while (true) { s.charAt(len); len++; } }
        catch (StringIndexOutOfBoundsException ignored) {}
        return len;
    }

    static int[] shortestLongest(String[] words) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (lengthManual(words[i]) < lengthManual(words[minIdx])) minIdx = i;
            if (lengthManual(words[i]) > lengthManual(words[maxIdx])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();

        String[] words = splitByCharAt(text);
        int[] idx = shortestLongest(words);

        System.out.println("Shortest word: " + words[idx[0]]);
        System.out.println("Longest  word: " + words[idx[1]]);
        sc.close();
    }
}
