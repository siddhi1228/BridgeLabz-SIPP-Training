package methods;

import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (canVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") cannot vote.");
            }
        sc.close();
        }
    }

    public static boolean canVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}
