package methods;

import java.util.*;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            
        }
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println(recursiveSum == formulaSum ? "Both results match." : "Mismatch in results.");
        sc.close();
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
