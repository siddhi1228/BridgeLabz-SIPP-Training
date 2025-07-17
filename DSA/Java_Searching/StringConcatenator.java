package Java_Searching;

public class StringConcatenator {
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Sample array
        String[] strings = {"Hello", " ", "World",  " Let's", " go!"};

        // Call the method and print the result
        String result = concatenateStrings(strings);
        System.out.println("Concatenated String: " + result);
    }
}
