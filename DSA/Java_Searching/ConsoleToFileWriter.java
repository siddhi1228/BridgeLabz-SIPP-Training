package Java_Searching;

import java.io.*;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\siddh\\eclipse-workspace\\immersion\\src\\Java_Searching\\sample.txt";

        try (
            // Read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Write to file
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            System.out.println("Start typing! (Type 'exit' to finish)");

            String inputLine;

            while (true) {
                inputLine = br.readLine(); // Read from console

                if ("exit".equalsIgnoreCase(inputLine)) {
                    break;
                }

                bw.write(inputLine);
                bw.newLine(); // Write as a new line in the file
            }

            System.out.println("Your input has been saved to: " + filePath);

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

