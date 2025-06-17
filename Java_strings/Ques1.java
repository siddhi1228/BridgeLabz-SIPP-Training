package Java_strings;
import java.util.*;
public class Ques1 {

	    public static void generateException(String input) {
	        // This will throw an exception because start index > end index
	        String result = input.substring(5, 2); // runtime exception occurs here
	        System.out.println("Generated Substring: " + result);
	    }
	    public static void handleException(String input) {
	        try {
	            String result = input.substring(5, 2);
	            System.out.println("Handled Substring: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();
	        System.out.println("\nCalling generateException (will crash the program):");
	        try {
	            generateException(userInput);  // This will throw and not be caught here
	        } catch (RuntimeException e) {
	            System.out.println("Caught in main (optional): " + e.getMessage());
	        }

	        System.out.println("\nCalling handleException (will handle the exception):");
	        handleException(userInput);

	        scanner.close();
	    }
	}

