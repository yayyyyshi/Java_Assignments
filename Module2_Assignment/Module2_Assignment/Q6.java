// Module 2 Assignment - Question 6
import java.util.function.Function;

public class Q6 {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> func = Q6::square;
        int num = 5;
        System.out.println("Square of " + num + ": " + func.apply(num));
    }
}
