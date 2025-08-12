// 31. Write a program to remove duplicate elements from an array.
    import java.util.Arrays;
    import java.util.LinkedHashSet;
    public class Program_31 {
        public static void main(String[] args) {
            Integer[] arr = {1, 2, 2, 3, 4, 4};
            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
            System.out.println("Array without duplicates: " + set);
        }
    }