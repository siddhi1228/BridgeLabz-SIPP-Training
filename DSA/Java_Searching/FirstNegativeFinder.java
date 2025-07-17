package Java_Searching;

public class FirstNegativeFinder {
    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 0, 3, -5, 9, -2};

        int result = findFirstNegativeIndex(numbers);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
