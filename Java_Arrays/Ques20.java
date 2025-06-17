package Java_Arrays;
import java.util.*;
public class Ques20 {
	public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (number != 0 && index < digits.length) {
            digits[index++] = number % 10;
            number /= 10;
        }
        System.out.println("Digits in reverse order:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        sc.close();
    }
}
