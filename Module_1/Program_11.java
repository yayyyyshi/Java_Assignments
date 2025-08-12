// 11. Write a program that uses Java's StringBuilder for efficient string operations.
    public class Program_11 {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            sb.insert(5, ", Java");
            sb.reverse();
            System.out.println(sb.toString());
        }
    }