public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) result += Character.toUpperCase(c);
            else result += c;
        }
        System.out.println("Toggled String: " + result);
    }
}