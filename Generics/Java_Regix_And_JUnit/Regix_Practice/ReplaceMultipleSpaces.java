package GENERICS.Regix_And_JUnit.Regix_Practice;

public class ReplaceMultipleSpaces {
    public static String normalizeSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String text = "This   is   a    test.";
        System.out.println(normalizeSpaces(text));
    }
}

