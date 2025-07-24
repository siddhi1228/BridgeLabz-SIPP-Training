package Java_Generics02;
public class CircularBuffer {
    private int[] buffer;
    private int size, start, end, count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        start = 0;
        end = 0;
        count = 0;
    }

    public void insert(int value) {
        buffer[end] = value;
        end = (end + 1) % size;
        if (count == size) {
            start = (start + 1) % size;
        } else {
            count++;
        }
    }

    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();  // [1, 2, 3]
        cb.insert(4);
        cb.printBuffer();  // [2, 3, 4]
        cb.insert(5);
        cb.printBuffer();  // [3, 4, 5]
    }
}
