// 12. Write a program to demonstrate the immutability of the String class.
    public class Program_12 {
        public static void main(String[] args) {
            String s1 = "Java";
            s1.concat(" is great"); // This creates a new string, but s1 remains unchanged
            System.out.println("s1 is still: " + s1);
            String s2 = s1.concat(" is great");
            System.out.println("s2 is the new string: " + s2);
        }
    }