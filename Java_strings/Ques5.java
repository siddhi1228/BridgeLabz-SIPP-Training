package Java_strings;
import java.util.*;

public class Ques5 {

    static char[] toCharArrayManually(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
        return arr;
    }

    static boolean arraysEqual(char[] a, char[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();

        char[] manual = toCharArrayManually(text);
        char[] builtin = text.toCharArray();

        System.out.println("Manual : " + Arrays.toString(manual));
        System.out.println("Built‑in: " + Arrays.toString(builtin));
        System.out.println("Arrays equal? " + arraysEqual(manual, builtin));
        sc.close();
    }
}
