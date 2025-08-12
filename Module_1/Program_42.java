// 42. Write a program to demonstrate multilevel inheritance in Java.
    class A {}
    class B extends A {}
    class C extends B {}
    public class Program_42 {
        public static void main(String[] args) {
            C obj = new C();
            System.out.println("C is instance of A: " + (obj instanceof A));
        }
    }