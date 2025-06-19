package methods;

import java.util.*;

public class Ques5
 {
	public class MaximumHandshakes {
	    public static int calculateHandshakes(int numberOfStudents) {
	        return numberOfStudents * (numberOfStudents - 1) / 2;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        int students = sc.nextInt();
	        int handshakes = calculateHandshakes(students);
	        System.out.println("Maximum handshakes among " + students + " students: " + handshakes);
	    sc.close();}
	}
}
