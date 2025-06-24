public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String oldWord = "Java";
        String newWord = "Python";
        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) result += newWord;
            else result += words[i];
            if (i < words.length - 1) result += " ";
        }
        System.out.println("Modified Sentence: " + result);
    }
}