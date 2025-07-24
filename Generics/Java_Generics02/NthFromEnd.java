package Java_Generics02;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        String result = findNthFromEnd(list, n);
        System.out.println(result);
    }

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) fast.next();
            else return null;
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
