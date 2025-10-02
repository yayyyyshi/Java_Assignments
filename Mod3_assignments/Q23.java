// Module 3 Assignment - Question 23
// Delete a file using File class.

import java.io.File;

public class Q23 {
    public static void main(String[] args) {
        File f = new File("to_delete.txt");
        if (f.exists()) {
            boolean ok = f.delete();
            System.out.println("Deleted " + f.getName() + ": " + ok);
        } else {
            System.out.println(f.getName() + " does not exist. Creating it for demo.");
            try { boolean created = f.createNewFile(); System.out.println("Created: " + created); } catch (Exception e) { System.err.println(e.getMessage()); }
        }
    }
}
