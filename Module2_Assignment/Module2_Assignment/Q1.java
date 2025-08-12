// Module 2 Assignment - Question 1
package utilities;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
}

// Separate file in same folder level to demonstrate usage
class Q1 {
    public static void main(String[] args) {
        utilities.MathUtils mu = new utilities.MathUtils();
        int sum = mu.add(5, 7);
        System.out.println("Sum: " + sum);
    }
}
