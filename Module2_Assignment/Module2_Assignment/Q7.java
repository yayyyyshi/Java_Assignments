// Module 2 Assignment - Question 7
public class Q7 {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Caught in try-catch: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Caught in try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
