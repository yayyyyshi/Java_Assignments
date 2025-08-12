// 49. Write a program to demonstrate the immutability of the String class.
    public class Program_49 {
        public static void main(String[] args) {
            String str = "Start";
            str.toUpperCase(); // Does not change str
            System.out.println("str is still: " + str);
        }
    }