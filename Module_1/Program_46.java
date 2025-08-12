// 46. Create a program to show run-time polymorphism using dynamic method dispatch.
    class Bank { float getRate() { return 0f; } }
    class HDFC extends Bank { float getRate() { return 8.5f; } }
    public class Program_46 {
        public static void main(String[] args) {
            Bank myBank = new HDFC(); // Superclass ref, subclass object
            System.out.println("Rate: " + myBank.getRate());
        }
    }