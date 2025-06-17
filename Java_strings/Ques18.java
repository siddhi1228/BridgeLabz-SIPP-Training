package Java_strings;

import java.util.*;

public class Ques18 {

    static String charType(char c) {
        char low = Character.toLowerCase(c);
        if (!Character.isLetter(c))           return "Not a Letter";
        return ("aeiou".indexOf(low) >= 0) ? "Vowel" : "Consonant";
    }

    static String[][] analyse(String text) {
        String[][] res = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            res[i][0] = String.valueOf(text.charAt(i));
            res[i][1] = charType(text.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String text = sc.nextLine();

        String[][] table = analyse(text);
        System.out.printf("%-5s | %-12s%n", "Char", "Type");
        System.out.println("--------------------");
        for (String[] row : table)
            System.out.printf("%-5s | %-12s%n", row[0], row[1]);
        sc.close();
    }
}

