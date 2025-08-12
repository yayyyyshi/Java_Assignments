// 23. Write a program to generate the first n terms of the Fibonacci series.
    public class Program_23 {
        public static void main(String[] args) {
            int n = 10, t1 = 0, t2 = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }