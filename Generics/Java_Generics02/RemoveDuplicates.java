package Java_Generics02;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> output = new ArrayList<>();
        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                output.add(num);
            }
        }
        return output;
    }
}
