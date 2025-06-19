package methods;

import java.util.*;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println("Youngest is: " + names[youngest]);
        System.out.println("Tallest is: " + names[tallest]);
        sc.close();
    }

    public static int findYoungest(int[] ages) {
        int min = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                index = i;
            }
        }
        return index;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0], index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                index = i;
            }
        }
        return index;
    }
}


