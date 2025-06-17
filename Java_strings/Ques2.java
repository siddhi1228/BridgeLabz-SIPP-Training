package Java_strings;

public class Ques2 {

    static void generateException() {
        String text = null;
        text.toLowerCase();               // NPE
    }

    static void handleException() {
        String text = null;
        try {
            text.toLowerCase();
        } catch (NullPointerException npe) {
            System.out.println("Handled NullPointerException → " + npe);
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (RuntimeException ignored) { }

        handleException();
    }
}

