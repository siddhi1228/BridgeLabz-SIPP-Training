package Java_Generics02;

import java.util.*;

public class ListRotator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        List<Integer> rotated = rotateList(list, k);
        System.out.println(rotated);
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;
        List<Integer> result = new ArrayList<>();
        for (int i = k; i < n; i++) result.add(list.get(i));
        for (int i = 0; i < k; i++) result.add(list.get(i));
        return result;
    }
}
