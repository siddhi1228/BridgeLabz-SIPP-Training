package GENERICS.Regix_And_JUnit.Regix_Practice;

import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguages {
    public static List<String> getProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        String pattern = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|PHP)\\b";
        Matcher m = Pattern.compile(pattern).matcher(text);
        while (m.find()) languages.add(m.group());
        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(getProgrammingLanguages(text));
    }
}

