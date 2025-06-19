package methods;

public class Ques22 {
    public static void main(String[] args) {
        int[] randoms = generateRandArray(5);
        double[] result = averageMinMax(randoms);

        System.out.print("Random Numbers: ");
        for (int num : randoms) {
            System.out.print(num + " ");
        }
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }

    public static int[] generateRandArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] averageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        return new double[]{sum / (double)numbers.length, min, max};
    }
}

