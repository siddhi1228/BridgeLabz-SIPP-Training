package Java_Stack_Queues_Hashmap;


public class CustomHM {

    static class Entry {
        int key, value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Entry[] buckets;

    public CustomHM() {
        buckets = new Entry[SIZE];
    }

    private int getIndex(int key) {
        return Math.abs(key) % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Entry head = buckets[index];

        Entry curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = head;
        buckets[index] = newEntry;
    }

    public Integer get(int key) {
        int index = getIndex(key);
        Entry curr = buckets[index];

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }

        return null;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Entry curr = buckets[index];
        Entry prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        CustomHM map = new CustomHM();
        map.put(1, 10);
        map.put(2, 20);
        map.put(1001, 30); 

        System.out.println(map.get(1));  
        System.out.println(map.get(2));  
        System.out.println(map.get(1001));

        map.remove(2);
        System.out.println(map.get(2));  
    }
}
