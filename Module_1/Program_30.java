// 30. Write a program to search for an element in a sorted array using the binary search algorithm.
    public class Program_30 {
        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16};
            int target = 12, left = 0, right = arr.length - 1, result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) { result = mid; break; }
                if (arr[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            System.out.println("Element found at index: " + result);
        }
    }