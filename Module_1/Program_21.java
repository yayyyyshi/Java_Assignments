// 21. Write a program to calculate the factorial of a given number using recursion.
    public class Program_21 {
        static long factorial(int n) {
            return (n <= 1) ? 1 : n * factorial(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("Factorial of 7: " + factorial(7));
        }
    }