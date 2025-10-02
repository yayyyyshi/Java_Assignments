// Module 3 Assignment - Question 25
// Demonstrate Math.random(), Math.abs(), and Math.pow()

public class Q25 {
    public static void main(String[] args) {
        double r = Math.random(); // [0,1)
        int a = -42;
        double p = Math.pow(2, 8); // 256
        System.out.println("Math.random() => " + r);
        System.out.println("Math.abs(" + a + ") => " + Math.abs(a));
        System.out.println("Math.pow(2,8) => " + p);
    }
}
