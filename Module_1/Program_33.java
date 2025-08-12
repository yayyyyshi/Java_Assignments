// 33. Create a program to show the difference between == and equals() for string comparison.
    public class Program_33 {
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            System.out.println("s1 == s2: " + (s1 == s2)); // true (same object)
            System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects)
            System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)
        }
    }