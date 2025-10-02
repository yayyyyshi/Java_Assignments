// Module 3 Assignment - Question 21
// List all files in a directory provided by the user (args[0]) or current directory.

import java.io.File;

public class Q21 {
    public static void main(String[] args) {
        String dir = args.length > 0 ? args[0] : ".";
        File d = new File(dir);
        if (!d.exists() || !d.isDirectory()) {
            System.err.println(dir + " is not a directory or does not exist.");
            return;
        }
        System.out.println("Listing files in: " + d.getAbsolutePath());
        File[] files = d.listFiles();
        if (files == null) { System.out.println("No files."); return; }
        for (File f : files) {
            System.out.println((f.isDirectory() ? "[DIR] " : "      ") + f.getName());
        }
    }
}
