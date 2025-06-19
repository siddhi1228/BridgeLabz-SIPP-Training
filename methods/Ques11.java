
package methods;

import java.util.Scanner;

public class Ques11 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int div = sc.nextInt();
	        findRemQuo(num, div);
	        sc.close();
	 }
	 public static void findRemQuo(int number, int divisor) {
	        int quotient = number / divisor;
	        int remainder = number % divisor;
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);
	    }
}
