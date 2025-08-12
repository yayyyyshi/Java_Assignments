// 35. Implement a program to perform bitwise operations in Java.
    public class Program_35 {
        public static void main(String[] args) {
            int a = 5, b = 3; // a=0101, b=0011
            System.out.println("a & b = " + (a & b)); // AND: 0001 = 1
            System.out.println("a | b = " + (a | b)); // OR:  0111 = 7
            System.out.println("a ^ b = " + (a ^ b)); // XOR: 0110 = 6
        }
    }