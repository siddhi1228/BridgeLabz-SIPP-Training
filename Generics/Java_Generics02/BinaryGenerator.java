package Java_Generics02;

import java.util.*;

public class BinaryGenerator {
    public static void main(String[] args) {
        int N = 5;
        List<String> result = generateBinaryNumbers(N);
        System.out.println(result);
    }

    public static List<String> generateBinaryNumbers(int N) {
        List<String> output = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            output.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return output;
    }
}
