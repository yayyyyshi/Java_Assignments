// 25. Write a program to find the sum of all elements in an array.
    public class Program_25 {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40};
            int sum = 0;
            for (int num : arr) sum += num;
            System.out.println("Sum: " + sum);
        }
    }