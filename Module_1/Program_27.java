// 27. Write a Java program to perform matrix addition and multiplication.
    import java.util.Arrays;
    public class Program_27 {
        public static void main(String[] args) {
            int[][] a = {{1, 1}, {2, 2}};
            int[][] b = {{3, 3}, {4, 4}};
            int[][] sum = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Matrix Sum: " + Arrays.deepToString(sum));
        }
    }