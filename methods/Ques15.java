package methods;

import java.util.*;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sc.close();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                if (isEven(numbers[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1)
            System.out.println("First number is greater than last");
        else if (comparison == 0)
            System.out.println("First and last numbers are equal");
        else
            System.out.println("First number is less than last");
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}

