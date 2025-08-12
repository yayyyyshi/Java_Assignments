// 34. Write a program to illustrate the use of the ternary operator.
    public class Program_34 {
        public static void main(String[] args) {
            int num = 10;
            String result = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(num + " is " + result);
        }
    }