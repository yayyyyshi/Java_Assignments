// Module 2 Assignment - Question 4
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Q4 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        
        System.out.println("Addition: " + add.compute(5, 3));
        System.out.println("Subtraction: " + sub.compute(5, 3));
        System.out.println("Multiplication: " + mul.compute(5, 3));
    }
}
