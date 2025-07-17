package Java_Searching;

public class SentenceSearcher {
    public static String findFirstSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a versatile programming language.",
            "Let's go grab some coffee!",
            "Linear search is simple but slow."
        };

        String searchWord = "coffee";

        String result = findFirstSentenceWithWord(sentences, searchWord);

        System.out.println("Result: " + result);
    }
}

