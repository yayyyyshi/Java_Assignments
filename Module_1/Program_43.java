// 43. Create a program to show method overriding and the use of super to call the parent class method.
    class Parent { void show() { System.out.println("Parent show"); } }
    class Child extends Parent {
        @Override void show() {
            super.show(); // Calls parent method
            System.out.println("Child show");
        }
    }
    public class Program_43 {
        public static void main(String[] args) { new Child().show(); }
    }