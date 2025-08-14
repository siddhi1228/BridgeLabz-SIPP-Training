package GENERICS.Exceptions;

import java.util.*;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error!");
        } finally {
            System.out.println("Operation completed");
        }
    }
}

