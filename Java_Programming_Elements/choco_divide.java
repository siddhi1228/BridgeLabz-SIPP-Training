package immersion.Java_Programming_Elements;
import java.util.*;
public class choco_divide {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choco = sc.nextInt();
        int child = sc.nextInt();
        int each = choco / child;
        int remain = choco % child;

        System.out.println("The number of chocolates each child gets is " + each+ " and the number of remaining chocolates is " + remain);
        sc.close();
        }
}
