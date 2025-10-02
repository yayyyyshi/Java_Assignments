// Module 3 Assignment - Question 22
// Copy contents of one file to another using byte streams (FileInputStream/FileOutputStream).

import java.io.*;

public class Q22 {
    public static void main(String[] args) {
        String src = "copy_src.txt";
        String dest = "copy_dest.txt";
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buf = new byte[1024];
            int n;
            while ((n = fis.read(buf)) != -1) fos.write(buf, 0, n);
            System.out.println("Copied " + src + " to " + dest);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Tip: ensure 'copy_src.txt' exists to test."); 
        }
    }
}
