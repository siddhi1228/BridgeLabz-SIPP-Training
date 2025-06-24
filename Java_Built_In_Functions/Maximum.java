import java.util.*;

public class Maximum {
    public static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    public static int maxOfThree(int a, int b,int c) {
        return Math.max(a, Math.max(b,c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = readInt(sc , "Enter first number :");
        int b = readInt(sc , "Enter second number :");
        int c = readInt(sc , "Enter third number :");

        System.out.println("Maximum of three numbers is :" + maxOfThree(a, b, c));
    }
}