package Java_Stack_Queues_Hashmap;

import java.util.*;

public class PairSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;

        boolean result = hasPairWithSum(arr, target);
        System.out.println(result); // Output: true
    }
}
