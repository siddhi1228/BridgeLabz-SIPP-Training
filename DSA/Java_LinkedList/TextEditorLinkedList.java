package Java_LinkedList;

public class TextEditorLinkedList {

    static class StateNode {
        String text;
        StateNode prev, next;

        public StateNode(String text) {
            this.text = text;
        }
    }

    private StateNode head = null;
    private StateNode tail = null;
    private StateNode current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void addState(String newText) {
        StateNode newNode = new StateNode(newText);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = newNode;
            size++;
        }

        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: \"" + current.text + "\"");
        } else {
            System.out.println("Editor is empty.");
        }
    }

    public static void main(String[] args) {
    	TextEditorLinkedList editor = new TextEditorLinkedList();

        editor.addState("H");
        editor.addState("He");
        editor.addState("Hel");
        editor.addState("Hell");
        editor.addState("Hello");

        editor.displayCurrentState();  // Hello

        editor.undo(); // Hell
        editor.displayCurrentState();

        editor.undo(); // Hel
        editor.displayCurrentState();

        editor.redo(); // Hell
        editor.displayCurrentState();

        editor.addState("Hello,"); // New state after undo breaks future redo
        editor.displayCurrentState();

        editor.undo(); // Hell
        editor.undo(); // Hel
        editor.undo(); // He
        editor.undo(); // H
        editor.undo(); // No more undo

        for (int i = 0; i < 12; i++) {
            editor.addState("State " + i);
        }

        System.out.println("\nAfter exceeding 10 states:");
        editor.undo();
        editor.displayCurrentState();
    }
}

