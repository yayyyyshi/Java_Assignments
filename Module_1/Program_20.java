// 20. Write a program to find the largest of three numbers entered by the user.
    import java.util.Scanner;
    public class Program_20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
            sc.close();
            int max = n1;
            if (n2 > max) max = n2;
            if (n3 > max) max = n3;
            System.out.println("Largest is: " + max);
        }
    }