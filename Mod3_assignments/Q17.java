// Module 3 Assignment - Question 17
// Read a file using FileReader and print contents to the console.

import java.io.FileReader;
import java.io.IOException;

public class Q17 {
    public static void main(String[] args) {
        String file = "sample_input.txt";
        try (FileReader fr = new FileReader(file)) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char)c);
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Tip: create 'sample_input.txt' to test."); 
        }
    }
}
