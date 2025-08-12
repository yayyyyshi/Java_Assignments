// 4. Write a program to demonstrate method overloading and method overriding.
    class Figure {
        void draw() {
            System.out.println("Drawing a generic figure.");
        }
    }

    class Circle extends Figure {
        @Override // Method Overriding
        void draw() {
            System.out.println("Drawing a circle. ⚪");
        }
    }

    class Adder {
        // Method Overloading
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    public class Program_4 {
        public static void main(String[] args) {
            System.out.println("--- Method Overriding ---");
            Figure myCircle = new Circle();
            myCircle.draw();

            System.out.println("\n--- Method Overloading ---");
            Adder adder = new Adder();
            System.out.println("add(5, 10) = " + adder.add(5, 10));
            System.out.println("add(3.5, 2.5) = " + adder.add(3.5, 2.5));
        }
    }