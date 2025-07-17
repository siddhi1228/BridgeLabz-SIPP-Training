package Java_Searching;

import java.io.*;

public class FileLineReader {
    public static void main(String[] args) {
        // Change this to the path of your file
        String filePath = "C:\\Users\\siddh\\eclipse-workspace\\immersion\\src\\Java_Searching\\sample.txt";

        // Try-with-resources to auto-close the streams
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            // Read and print each line until EOF (null)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
