package Java_Generics02;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\\\Users\\\\siddh\\\\eclipse-workspace\\\\immersion\\\\src\\\\Java_Searching\\\\sample.txt");
        Map<String, Integer> freqMap = new HashMap<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        scanner.close();

        System.out.println(freqMap);
    }
}

