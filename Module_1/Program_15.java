// 15. Write a program to check if a number is prime using a while loop.
    public class Program_15 {
        public static void main(String[] args) {
            int num = 29, i = 2;
            boolean isPrime = true;
            if (num <= 1) isPrime = false;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) System.out.println(num + " is prime.");
            else System.out.println(num + " is not prime.");
        }
    }