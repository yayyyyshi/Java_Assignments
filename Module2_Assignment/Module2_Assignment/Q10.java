// Module 2 Assignment - Question 10
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q10 {
    public static long factorial(int n) throws NegativeNumberException {
        if (n < 0) throw new NegativeNumberException("Number must be non-negative.");
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial: " + factorial(5));
            System.out.println("Factorial: " + factorial(-3));
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
