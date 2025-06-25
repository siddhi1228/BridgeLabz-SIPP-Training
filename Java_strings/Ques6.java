package Java_strings;
import java.util.*;

public class Ques6 {

    static String substringByCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String text = sc.nextLine();
        System.out.print("Start index: ");
        int s = sc.nextInt();
        System.out.print("End index: ");
        int e = sc.nextInt();

        String manual = substringByCharAt(text, s, e);
        String builtin = text.substring(Math.min(s, text.length()), Math.min(e, text.length()));

        System.out.println("Manual  = " + manual);
        System.out.println("Builtin= " + builtin);
        System.out.println("Equal?  = " + manual.equals(builtin));
        sc.close();
    }
}

