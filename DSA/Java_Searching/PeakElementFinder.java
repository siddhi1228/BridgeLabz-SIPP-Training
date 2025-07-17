package Java_Searching;

public class PeakElementFinder {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            boolean leftSmaller = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            if (leftSmaller && rightSmaller) {
                return mid; 
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(nums);
        System.out.println("Peak found at index: " + peakIndex);
        System.out.println("Peak element is: " + nums[peakIndex]);
    }
}
