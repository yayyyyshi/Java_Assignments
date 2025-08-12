// 17. Write a program to identify valid and invalid identifiers in Java.
    public class Program_17 {
        public static void main(String[] args) {
            int validIdentifier = 10;
            int _anotherValid = 20;
            int $alsoValid = 30;
            System.out.println("validIdentifier is a valid name.");
            // int 1invalid; // ERROR: Cannot start with a digit.
            // int my-var;   // ERROR: Hyphen not allowed.
        }
    }