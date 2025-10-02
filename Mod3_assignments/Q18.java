// Module 3 Assignment - Question 18
// Write a string to a file using FileWriter; write to example.txt.

import java.io.FileWriter;
import java.io.IOException;

public class Q18 {
    public static void main(String[] args) {
        String file = "example.txt";
        String content = "This is example content written using FileWriter.";
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("Wrote to " + file + ": " + content);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
