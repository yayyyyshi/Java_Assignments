// 10. Show an example of the final keyword for variables, methods, and classes.
    final class FinalClass {} // Cannot be subclassed

    class Base {
        final void finalMethod() {} // Cannot be overridden
    }

    public class Program_10 {
        public static void main(String[] args) {
            final double PI = 3.14159; // A constant
            System.out.println("Final variable PI: " + PI);
        }
    }