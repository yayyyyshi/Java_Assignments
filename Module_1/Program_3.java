// 3. Explain and implement the concept of abstraction in Java using interfaces.
    interface Vehicle {
        void start();
        void stop();
    }

    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car starts. 🚗");
        }

        @Override
        public void stop() {
            System.out.println("Car stops.");
        }
    }

    public class Program_3 {
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.start();
            myCar.stop();
        }
    }