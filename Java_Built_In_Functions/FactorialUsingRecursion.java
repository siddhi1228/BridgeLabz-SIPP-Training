import java.util.*;

public class FactorialUsingRecursion{
    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        return sc.nextInt();
    }
    public static int factorial(int input) {
        if(input==0 || input==1) return 1;
        return input*factorial(input-1);
    }
    public static void main(String[] args) {
        int input = input();
        System.out.println("Factorial of " + input + " is " + factorial(input));
    }
}