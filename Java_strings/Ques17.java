package Java_strings;

import java.util.*;

public class Ques17 {

    static int[] randomAges(int n) {
        Random rnd = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + rnd.nextInt(41); // 10‑50
        return ages;
    }

    static String[][] ageEligibility(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }
        return table;
    }

    public static void main(String[] args) {
        int[] ages = randomAges(10);
        String[][] table = ageEligibility(ages);

        System.out.printf("%-5s | %-11s%n", "Age", "Eligibility");
        System.out.println("------------------");
        for (String[] row : table)
            System.out.printf("%-5s | %-11s%n", row[0], row[1]);
    }
}

