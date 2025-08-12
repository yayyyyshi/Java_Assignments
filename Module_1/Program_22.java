// 22. Write a program to check if a given string or number is a palindrome.
    public class Program_22 {
        static boolean isPalindrome(String s) {
            return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        }
        public static void main(String[] args) {
            System.out.println("Is 'Racecar' a palindrome? " + isPalindrome("Racecar"));
            System.out.println("Is 12321 a palindrome? " + isPalindrome(String.valueOf(12321)));
        }
    }