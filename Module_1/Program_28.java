// 28. Create a program to sort an array using the bubble sort algorithm.
    import java.util.Arrays;
    public class Program_28 {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted: " + Arrays.toString(arr));
        }
    }