package Java_Searching;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PerformanceTest {
    public static void main(String[] args) {
        String word = "hello";
        int iterations = 1_000_000;
        String filePath = "C:\\Users\\siddh\\eclipse-workspace\\immersion\\src\\Java_Searching\\sample.txt";

        System.out.println("=== String Concatenation Performance ===");

        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(word);
        }
        long endSB = System.nanoTime();
        System.out.println("StringBuilder time: " + (endSB - startSB) / 1_000_000 + " ms");

        long startSBuf = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(word);
        }
        long endSBuf = System.nanoTime();
        System.out.println("StringBuffer time: " + (endSBuf - startSBuf) / 1_000_000 + " ms");

        System.out.println("\n=== File Reading and Word Count ===");

        try {
            long startFR = System.nanoTime();
            int wordCountFR = countWordsUsingFileReader(filePath);
            long endFR = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCountFR);
            System.out.println("FileReader Time: " + (endFR - startFR) / 1_000_000 + " ms");

            long startISR = System.nanoTime();
            int wordCountISR = countWordsUsingInputStreamReader(filePath);
            long endISR = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCountISR);
            System.out.println("InputStreamReader Time: " + (endISR - startISR) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countWordsUsingFileReader(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {

            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            return wordCount;
        }
    }

    public static int countWordsUsingInputStreamReader(String path) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            return wordCount;
        }
    }
}

