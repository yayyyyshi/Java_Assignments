// Module 3 Assignment - Question 15
// Read a text file using FileInputStream and print contents to console.

import java.io.FileInputStream;
import java.io.IOException;

public class Q15 {
    public static void main(String[] args) {
        String file = "sample_input.txt";
        System.out.println("Attempting to read file: " + file);
        try (FileInputStream fis = new FileInputStream(file)) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char)b);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.err.println("Tip: create a file named 'sample_input.txt' next to the classpath to test."); 
        }
    }
}
