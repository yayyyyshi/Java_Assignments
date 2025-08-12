// 18. Write a program to find the largest and smallest numbers in an array.
    public class Program_18 {
        public static void main(String[] args) {
            int[] arr = {99, 5, 23, 1, 67};
            int min = arr[0], max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
                if (arr[i] > max) max = arr[i];
            }
            System.out.println("Min: " + min + ", Max: " + max);
        }
    }