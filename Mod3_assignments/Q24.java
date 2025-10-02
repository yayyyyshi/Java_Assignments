// Module 3 Assignment - Question 24
// RandomAccessFile example: write some bytes then overwrite a portion and read back.

import java.io.RandomAccessFile;

public class Q24 {
    public static void main(String[] args) {
        String file = "random_access.dat";
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.setLength(0);
            raf.writeUTF("HelloWorldABCDEFG");
            raf.seek(5); // move to position after 'Hello'
            raf.writeUTF("-MID-"); // overwrite a portion
            raf.seek(0);
            System.out.println("File contents (UTF read): " + raf.readUTF());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
