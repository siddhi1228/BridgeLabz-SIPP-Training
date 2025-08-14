package GENERICS.Regix_And_JUnit.Regix_Practice;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String[] inputs = {
            "My SSN is 123-45-6789.",
            "My SSN is 123456789."
        };

        String ssnRegex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        for (String text : inputs) {
            Matcher matcher = Pattern.compile(ssnRegex).matcher(text);
            if (matcher.find()) {
                System.out.println("✅ \"" + matcher.group() + "\" is valid");
            } else {
                System.out.println("❌ No valid SSN found in: " + text);
            }
        }
    }
}

