package Java_Arrays;
import java.util.*;
public class Ques12 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] age = new int[3];
	        double[] height = new double[3];
	        String[] names = {"Amar", "Akbar", "Anthony"};
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter age and height of " + names[i] + ": ");
	            age[i] = sc.nextInt();
	            height[i] = sc.nextDouble();
	        }
	        int youngestIndex = 0;
	        double tallest = height[0];
	        int tallestIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (age[i] < age[youngestIndex]) youngestIndex = i;
	            if (height[i] > tallest) {
	                tallest = height[i];
	                tallestIndex = i;
	            }
	        }
	        System.out.println("Youngest: " + names[youngestIndex]);
	        System.out.println("Tallest: " + names[tallestIndex]);
	        sc.close();
	    }
}
