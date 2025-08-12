// 50. Create a program to check if a given string is a palindrome.
    public class Program_50 {
        public static void main(String[] args) {
            String s = "level";
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println("Is palindrome? " + s.equals(reversed));
        }
    }