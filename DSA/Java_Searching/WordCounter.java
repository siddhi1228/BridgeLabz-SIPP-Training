package Java_Searching;

import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\siddh\\eclipse-workspace\\immersion\\src\\Java_Searching\\sample.txt";        
        String targetWord = "AI";           
        int count = 0;                         

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
