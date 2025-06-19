package methods;

import java.util.*;

public class Ques32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(num, digits));
        printFrequency(digits);
        sc.close();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d * d;
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    public static void printFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println(i + " → " + freq[i]);
    }
}

