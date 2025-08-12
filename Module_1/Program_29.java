// 29. Write a program to demonstrate a 2D array and print its elements.
    public class Program_29 {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2}, {3, 4}};
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }