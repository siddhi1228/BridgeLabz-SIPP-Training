package Java_LinkedList;

public class InventoryLinkedList {

    static class ItemNode {
        String name;
        int id;
        int quantity;
        double price;
        ItemNode next;

        public ItemNode(String name, int id, int quantity, double price) {
            this.name = name;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    private ItemNode head = null;

    public void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int pos, String name, int id, int quantity, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, quantity, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        ItemNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(name, id, quantity, price);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item name not found.");
    }

    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    public void sortByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    private ItemNode mergeSort(ItemNode head, String key, boolean ascending) {
        if (head == null || head.next == null) return head;
        ItemNode mid = getMiddle(head);
        ItemNode right = mid.next;
        mid.next = null;
        ItemNode leftSorted = mergeSort(head, key, ascending);
        ItemNode rightSorted = mergeSort(right, key, ascending);
        return merge(leftSorted, rightSorted, key, ascending);
    }

    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode merge(ItemNode a, ItemNode b, String key, boolean ascending) {
        ItemNode dummy = new ItemNode("", 0, 0, 0);
        ItemNode tail = dummy;

        while (a != null && b != null) {
            boolean condition;
            if (key.equals("name")) {
                condition = ascending ? a.name.compareToIgnoreCase(b.name) <= 0 : a.name.compareToIgnoreCase(b.name) > 0;
            } else {
                condition = ascending ? a.price <= b.price : a.price > b.price;
            }

            if (condition) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) tail.next = a;
        if (b != null) tail.next = b;
        return dummy.next;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        ItemNode temp = head;
        System.out.println("Inventory Items:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
    	InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd("Laptop", 101, 10, 50000);
        inv.addAtBeginning("Mouse", 102, 50, 500);
        inv.addAtPosition(2, "Keyboard", 103, 20, 1200);

        inv.displayAll();
        inv.calculateTotalValue();

        inv.searchById(103);
        inv.searchByName("mouse");

        inv.updateQuantity(101, 15);

        inv.removeById(102);
        inv.displayAll();

        inv.sortByName(true);
        System.out.println("Sorted by Name Asc:");
        inv.displayAll();

        inv.sortByPrice(false);
        System.out.println("Sorted by Price Desc:");
        inv.displayAll();
    }
}

