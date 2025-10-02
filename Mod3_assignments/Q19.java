// Module 3 Assignment - Question 19
// BufferedReader and BufferedWriter example to improve I/O performance.

import java.io.*;

public class Q19 {
    public static void main(String[] args) {
        String file = "buffer_example.txt";
        String text = "Line1\nLine2\nLine3";
        // Write using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(text);
            System.out.println("Buffered write complete to " + file);
        } catch (IOException e) {
            System.err.println("Write error: " + e.getMessage());
        }
        // Read using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contents of " + file + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }
}
