package methods;

import java.util.*;

public class Ques26 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        int sum = sumHeights(heights);
        double mean = meanHeight(sum, heights.length);
        int min = findMin(heights);
        int max = findMax(heights);

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nMean Height: " + mean);
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int sum, int count) {
        return (double) sum / count;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int a : arr) if (a < min) min = a;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int a : arr) if (a > max) max = a;
        return max;
    }
}

