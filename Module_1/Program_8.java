// 8. Demonstrate the concept of constructors in OOP with a program.
    class Car {
        String model;
        Car() { // Default constructor
            model = "Unknown";
        }
        Car(String model) { // Parameterized constructor
            this.model = model;
        }
        void display() {
            System.out.println("Car Model: " + model);
        }
    }

    public class Program_8 {
        public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = new Car("Tesla");
            car1.display();
            car2.display();
        }
    }