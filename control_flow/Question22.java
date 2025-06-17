package control_flow;

public class Question22 {
	public static void main(String[] args) {
        int number = 100;
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
