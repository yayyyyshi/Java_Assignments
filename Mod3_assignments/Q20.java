// Module 3 Assignment - Question 20
// Check if a file exists; if not, create it using File class.

import java.io.File;
import java.io.IOException;

public class Q20 {
    public static void main(String[] args) {
        File f = new File("check_file.txt");
        try {
            if (f.exists()) {
                System.out.println(f.getName() + " exists. Size: " + f.length() + " bytes");
            } else {
                boolean created = f.createNewFile();
                System.out.println("File did not exist. Created: " + created);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
