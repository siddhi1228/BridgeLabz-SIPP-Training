public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != remove) result += c;
        }
        System.out.println("Modified String: " + result);
    }
}