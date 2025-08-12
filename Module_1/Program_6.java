// 6. Develop a program to implement multiple inheritance using interfaces.
    interface CanFly {
        void fly();
    }

    interface CanSwim {
        void swim();
    }

    class Duck implements CanFly, CanSwim {
        @Override
        public void fly() {
            System.out.println("Duck is flying.");
        }

        @Override
        public void swim() {
            System.out.println("Duck is swimming.");
        }
    }

    public class Program_6 {
        public static void main(String[] args) {
            Duck myDuck = new Duck();
            myDuck.fly();
            myDuck.swim();
        }
    }