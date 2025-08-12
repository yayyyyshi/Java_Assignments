// 37. Write a program to create a class with multiple constructors (constructor overloading).
    class Box {
        Box() { System.out.println("Default constructor"); }
        Box(int len) { System.out.println("One-param constructor: " + len); }
    }
    public class Program_37 {
        public static void main(String[] args) {
            new Box();
            new Box(10);
        }
    }