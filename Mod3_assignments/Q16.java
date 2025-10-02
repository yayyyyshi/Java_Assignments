// Module 3 Assignment - Question 16
// Write a string into a file using FileOutputStream. Writes 'Java I/O Streams Example' to output.txt

import java.io.FileOutputStream;
import java.io.IOException;

public class Q16 {
    public static void main(String[] args) {
        String outFile = "output.txt";
        String data = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            fos.write(data.getBytes());
            System.out.println("Wrote to " + outFile + ": '" + data + "'"); 
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
