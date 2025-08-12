// 2. Create a program showing the use of inheritance and polymorphism.
    class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks: Woof! 🐕");
        }
    }

    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows: Meow! 🐈");
        }
    }

    public class Program_2 {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            Animal myCat = new Cat();
            myDog.makeSound();
            myCat.makeSound();
        }
    }