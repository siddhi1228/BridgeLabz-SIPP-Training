package Java_Generics02;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freqMap = countFrequency(input);
        System.out.println(freqMap);
    }

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }
}

