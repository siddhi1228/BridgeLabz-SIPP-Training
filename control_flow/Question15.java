package control_flow;

public class Question15 {
	public static void main(String[] args) {
        int number = 5;
        int factorial = 1, i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is: " + factorial);
        }
}
