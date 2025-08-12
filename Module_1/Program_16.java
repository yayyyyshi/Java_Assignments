// 16. Create a program to calculate the factorial of a number using recursion.
    public class Program_16 {
        static long factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("Factorial of 5: " + factorial(5));
        }
    }