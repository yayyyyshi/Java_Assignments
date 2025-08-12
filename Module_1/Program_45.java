// 45. Write a program to demonstrate final classes and methods.
    final class FinalClass {} // Cannot be subclassed
    class BaseWithFinal { final void show() {} } // Cannot be overridden
    public class Program_45 {
        public static void main(String[] args) { System.out.println("Final demo."); }
    }