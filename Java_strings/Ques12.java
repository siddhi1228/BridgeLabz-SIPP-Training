package Java_strings;

import java.util.*;

public class Ques12 {

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) >= 0;
    }

    static int[] countVC(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if      (Character.isLetter(c) && isVowel(c))      vowels++;
            else if (Character.isLetter(c))                    consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String text = sc.nextLine();

        int[] vc = countVC(text);
        System.out.println("Vowels     : " + vc[0]);
        System.out.println("Consonants : " + vc[1]);
        sc.close();
    }
}
