package Java_Searching;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Step 2: Create a StringBuilder with the input
        StringBuilder sb = new StringBuilder(input);

        // Step 3: Reverse the string
        sb.reverse();

        // Step 4: Convert back to String and print
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();    }
}
