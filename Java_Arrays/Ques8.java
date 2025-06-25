package Java_Arrays;
import java.util.*;
public class Ques8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0)
                    System.out.println(nums[i] + " is positive even");
                else
                    System.out.println(nums[i] + " is positive odd");
            } else if (nums[i] < 0)
                System.out.println(nums[i] + " is negative");
            else
                System.out.println(nums[i] + " is zero");
        }
        if (nums[0] == nums[4])
            System.out.println("First and last elements are equal");
        else if (nums[0] > nums[4])
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");
        sc.close();
    }
}
