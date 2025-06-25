package Java_strings;
import java.util.*;

public class Ques11
{

    // manual split
    static String[] splitByCharAt(String text) {
        int spaces = 1;                      // at least one word
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
        try {
            while (true) { s.charAt(len); len++; }
        } catch (StringIndexOutOfBoundsException ignored) { }
        return len;
    }

    static String[][] toWordLenTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(lengthManual(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String text = sc.nextLine();

        String[] words = splitByCharAt(text);
        String[][] table = toWordLenTable(words);

        System.out.printf("%-15s | %-5s%n", "Word", "Len");
        System.out.println("-------------------------");
        for (String[] row : table)
            System.out.printf("%-15s | %-5s%n", row[0], row[1]);
        sc.close();
    }
}

