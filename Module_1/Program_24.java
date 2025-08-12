// 24. Write a program to check whether a given number is prime.
    public class Program_24 {
        public static void main(String[] args) {
            int num = 13; boolean isPrime = true;
            if (num <= 1) isPrime = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { isPrime = false; break; }
            }
            System.out.println(num + (isPrime ? " is prime." : " is not prime."));
        }
    }