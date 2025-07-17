package Java_Searching;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryToTextReader {
    public static void main(String[] args) {
        // Update this with your actual file path
        String filePath = "C:\\Users\\siddh\\eclipse-workspace\\immersion\\src\\Java_Searching\\sample.txt";

        // Try-with-resources for safe auto-close
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each decoded line
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
