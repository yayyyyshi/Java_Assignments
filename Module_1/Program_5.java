// 5. Create a class hierarchy for animals that demonstrates polymorphism.
    abstract class AnimalHierarchy {
        abstract void speak();
    }

    class Lion extends AnimalHierarchy {
        @Override
        void speak() {
            System.out.println("Lion roars! 🦁");
        }
    }

    class Elephant extends AnimalHierarchy {
        @Override
        void speak() {
            System.out.println("Elephant trumpets! 🐘");
        }
    }

    public class Program_5 {
        public static void main(String[] args) {
            AnimalHierarchy[] zoo = {new Lion(), new Elephant()};
            for (AnimalHierarchy animal : zoo) {
                animal.speak();
            }
        }
    }