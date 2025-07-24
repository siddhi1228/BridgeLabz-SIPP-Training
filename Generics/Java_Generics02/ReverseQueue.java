package Java_Generics02;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int front = q.remove();
        reverse(q);
        q.add(front);
    }
}
