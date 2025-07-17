package Java_Searching;

import java.util.Arrays;

public class LinearBinaryChallenge {

    
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

    
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

     
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val <= n) {
                nums[val - 1] = -Math.abs(nums[val - 1]); // mark as visited
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; 
    }


    public static int binarySearch(int[] sortedArr, int target) {
        int left = 0, right = sortedArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortedArr[mid] == target) {
                return mid;
            } else if (sortedArr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int[] copyForSearch = Arrays.copyOf(arr, arr.length); 

     
        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        Arrays.sort(copyForSearch); 
        int target = 4;
        int index = binarySearch(copyForSearch, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index + " in sorted array.");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}

