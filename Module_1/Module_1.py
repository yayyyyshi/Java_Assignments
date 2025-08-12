# import os

# def create_files(count, extension, folder="/Users/pranavsharma/Desktop/Amity/Class codes/Java/Module_1"):
#     extension = extension.lstrip(".")
#     os.makedirs(folder, exist_ok=True)

#     for i in range(1, count + 1):
#         filename = f"Program_{i}.{extension}"
#         filepath = os.path.join(folder, filename)
        
#         with open(filepath, "w") as file:
#             file.write(f"")
        
#         print(f"Created: {filepath}")

# create_files(50, "java")


import os

# Paste the entire 'java_codes' dictionary from above here
java_codes = {
    "Program_1.java": """
    // 1. Write a program to demonstrate encapsulation in Java.
    class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }
    }

    public class Program_1 {
        public static void main(String[] args) {
            Person person = new Person();
            person.setName("Aditya");
            person.setAge(25);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }
    """,
        "Program_2.java": """
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
    """,
        "Program_3.java": """
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
    """,
        "Program_4.java": """
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

            System.out.println("\\n--- Method Overloading ---");
            Adder adder = new Adder();
            System.out.println("add(5, 10) = " + adder.add(5, 10));
            System.out.println("add(3.5, 2.5) = " + adder.add(3.5, 2.5));
        }
    }
    """,
        "Program_5.java": """
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
    """,
        "Program_6.java": """
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
    """,
        "Program_7.java": """
    // 7. Write a Java program to showcase the use of this and super keywords.
    class SuperClass {
        String name = "SuperClass";
        SuperClass() {
            System.out.println("SuperClass constructor called.");
        }
    }

    class SubClass extends SuperClass {
        String name;
        SubClass(String name) {
            super(); // Calls parent constructor
            this.name = name; // 'this' refers to current class instance variable
        }
        void printName() {
            System.out.println("SubClass name: " + this.name);
            System.out.println("SuperClass name: " + super.name); // 'super' refers to parent
        }
    }

    public class Program_7 {
        public static void main(String[] args) {
            SubClass obj = new SubClass("MySub");
            obj.printName();
        }
    }
    """,
        "Program_8.java": """
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
    """,
        "Program_9.java": """
    // 9. Explain and implement the concept of access modifiers in Java.
    class AccessExample {
        public String publicMessage = "This is public.";
        protected String protectedMessage = "This is protected.";
        String defaultMessage = "This is default.";
        private String privateMessage = "This is private.";
    }

    public class Program_9 {
        public static void main(String[] args) {
            AccessExample obj = new AccessExample();
            System.out.println(obj.publicMessage);
            System.out.println(obj.protectedMessage);
            System.out.println(obj.defaultMessage);
            // System.out.println(obj.privateMessage); // COMPILE ERROR!
        }
    }
    """,
        "Program_10.java": """
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
    """,
        "Program_11.java": """
    // 11. Write a program that uses Java's StringBuilder for efficient string operations.
    public class Program_11 {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            sb.insert(5, ", Java");
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
    """,
        "Program_12.java": """
    // 12. Write a program to demonstrate the immutability of the String class.
    public class Program_12 {
        public static void main(String[] args) {
            String s1 = "Java";
            s1.concat(" is great"); // This creates a new string, but s1 remains unchanged
            System.out.println("s1 is still: " + s1);
            String s2 = s1.concat(" is great");
            System.out.println("s2 is the new string: " + s2);
        }
    }
    """,
        "Program_13.java": """
    // 13. Write a program to declare variables of all primitive data types and print their default values.
    public class Program_13 {
        static byte b; static short s; static int i; static long l;
        static float f; static double d; static char c; static boolean bool;
        public static void main(String[] args) {
            System.out.println("byte: " + b); System.out.println("short: " + s);
            System.out.println("int: " + i); System.out.println("long: " + l);
            System.out.println("float: " + f); System.out.println("double: " + d);
            System.out.println("char: " + c); System.out.println("boolean: " + bool);
        }
    }
    """,
        "Program_14.java": """
    // 14. Implement a program to demonstrate the use of if-else, switch, and for loops.
    public class Program_14 {
        public static void main(String[] args) {
            int score = 85;
            if (score >= 90) System.out.println("Grade A");
            else System.out.println("Grade B or lower");

            int day = 3;
            switch (day) {
                case 1: System.out.println("Monday"); break;
                default: System.out.println("Some other day"); break;
            }

            for (int i = 0; i < 3; i++) System.out.println("Loop count: " + i);
        }
    }
    """,
        "Program_15.java": """
    // 15. Write a program to check if a number is prime using a while loop.
    public class Program_15 {
        public static void main(String[] args) {
            int num = 29, i = 2;
            boolean isPrime = true;
            if (num <= 1) isPrime = false;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) System.out.println(num + " is prime.");
            else System.out.println(num + " is not prime.");
        }
    }
    """,
        "Program_16.java": """
    // 16. Create a program to calculate the factorial of a number using recursion.
    public class Program_16 {
        static long factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("Factorial of 5: " + factorial(5));
        }
    }
    """,
        "Program_17.java": """
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
    """,
        "Program_18.java": """
    // 18. Write a program to find the largest and smallest numbers in an array.
    public class Program_18 {
        public static void main(String[] args) {
            int[] arr = {99, 5, 23, 1, 67};
            int min = arr[0], max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
                if (arr[i] > max) max = arr[i];
            }
            System.out.println("Min: " + min + ", Max: " + max);
        }
    }
    """,
        "Program_19.java": """
    // 19. Write a program to check if a given number is odd or even.
    public class Program_19 {
        public static void main(String[] args) {
            int num = 42;
            if (num % 2 == 0) System.out.println(num + " is even.");
            else System.out.println(num + " is odd.");
        }
    }
    """,
        "Program_20.java": """
    // 20. Write a program to find the largest of three numbers entered by the user.
    import java.util.Scanner;
    public class Program_20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
            sc.close();
            int max = n1;
            if (n2 > max) max = n2;
            if (n3 > max) max = n3;
            System.out.println("Largest is: " + max);
        }
    }
    """,
        "Program_21.java": """
    // 21. Write a program to calculate the factorial of a given number using recursion.
    public class Program_21 {
        static long factorial(int n) {
            return (n <= 1) ? 1 : n * factorial(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("Factorial of 7: " + factorial(7));
        }
    }
    """,
        "Program_22.java": """
    // 22. Write a program to check if a given string or number is a palindrome.
    public class Program_22 {
        static boolean isPalindrome(String s) {
            return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        }
        public static void main(String[] args) {
            System.out.println("Is 'Racecar' a palindrome? " + isPalindrome("Racecar"));
            System.out.println("Is 12321 a palindrome? " + isPalindrome(String.valueOf(12321)));
        }
    }
    """,
        "Program_23.java": """
    // 23. Write a program to generate the first n terms of the Fibonacci series.
    public class Program_23 {
        public static void main(String[] args) {
            int n = 10, t1 = 0, t2 = 1;
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }
    """,
        "Program_24.java": """
    // 24. Write a program to check whether a given number is prime.
    public class Program_24 {
        public static void main(String[] args) {
            int num = 13; boolean isPrime = true;
            if (num <= 1) isPrime = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { isPrime = false; break; }
            }
            System.out.println(num + (isPrime ? " is prime." : " is not prime."));
        }
    }
    """,
        "Program_25.java": """
    // 25. Write a program to find the sum of all elements in an array.
    public class Program_25 {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40};
            int sum = 0;
            for (int num : arr) sum += num;
            System.out.println("Sum: " + sum);
        }
    }
    """,
        "Program_26.java": """
    // 26. Implement a program to reverse the elements of an array.
    import java.util.Arrays;
    public class Program_26 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            System.out.println("Reversed: " + Arrays.toString(arr));
        }
    }
    """,
        "Program_27.java": """
    // 27. Write a Java program to perform matrix addition and multiplication.
    import java.util.Arrays;
    public class Program_27 {
        public static void main(String[] args) {
            int[][] a = {{1, 1}, {2, 2}};
            int[][] b = {{3, 3}, {4, 4}};
            int[][] sum = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Matrix Sum: " + Arrays.deepToString(sum));
        }
    }
    """,
        "Program_28.java": """
    // 28. Create a program to sort an array using the bubble sort algorithm.
    import java.util.Arrays;
    public class Program_28 {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted: " + Arrays.toString(arr));
        }
    }
    """,
        "Program_29.java": """
    // 29. Write a program to demonstrate a 2D array and print its elements.
    public class Program_29 {
        public static void main(String[] args) {
            int[][] matrix = {{1, 2}, {3, 4}};
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    """,
        "Program_30.java": """
    // 30. Write a program to search for an element in a sorted array using the binary search algorithm.
    public class Program_30 {
        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16};
            int target = 12, left = 0, right = arr.length - 1, result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) { result = mid; break; }
                if (arr[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            System.out.println("Element found at index: " + result);
        }
    }
    """,
        "Program_31.java": """
    // 31. Write a program to remove duplicate elements from an array.
    import java.util.Arrays;
    import java.util.LinkedHashSet;
    public class Program_31 {
        public static void main(String[] args) {
            Integer[] arr = {1, 2, 2, 3, 4, 4};
            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
            System.out.println("Array without duplicates: " + set);
        }
    }
    """,
        "Program_32.java": """
    // 32. Write a program to demonstrate the use of arithmetic, relational, and logical operators.
    public class Program_32 {
        public static void main(String[] args) {
            int a = 10, b = 5;
            System.out.println("Arithmetic: a + b = " + (a + b));
            System.out.println("Relational: a > b is " + (a > b));
            System.out.println("Logical: (a > b) && (b > 0) is " + ((a > b) && (b > 0)));
        }
    }
    """,
        "Program_33.java": """
    // 33. Create a program to show the difference between == and equals() for string comparison.
    public class Program_33 {
        public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = new String("Hello");
            System.out.println("s1 == s2: " + (s1 == s2)); // true (same object)
            System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects)
            System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)
        }
    }
    """,
        "Program_34.java": """
    // 34. Write a program to illustrate the use of the ternary operator.
    public class Program_34 {
        public static void main(String[] args) {
            int num = 10;
            String result = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(num + " is " + result);
        }
    }
    """,
        "Program_35.java": """
    // 35. Implement a program to perform bitwise operations in Java.
    public class Program_35 {
        public static void main(String[] args) {
            int a = 5, b = 3; // a=0101, b=0011
            System.out.println("a & b = " + (a & b)); // AND: 0001 = 1
            System.out.println("a | b = " + (a | b)); // OR:  0111 = 7
            System.out.println("a ^ b = " + (a ^ b)); // XOR: 0110 = 6
        }
    }
    """,
        "Program_36.java": """
    // 36. Write a program to demonstrate operator precedence in Java.
    public class Program_36 {
        public static void main(String[] args) {
            int result = 10 + 5 * 2; // 5*2 is done first
            System.out.println("10 + 5 * 2 = " + result); // 20
        }
    }
    """,
        "Program_37.java": """
    // 37. Write a program to create a class with multiple constructors (constructor overloading).
    class Box {
        Box() { System.out.println("Default constructor"); }
        Box(int len) { System.out.println("One-param constructor: " + len); }
    }
    public class Program_37 {
        public static void main(String[] args) {
            new Box();
            new Box(10);
        }
    }
    """,
        "Program_38.java": """
    // 38. Implement a program to demonstrate the use of a copy constructor in Java.
    class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        Point(Point other) { this.x = other.x; this.y = other.y; } // Copy constructor
    }
    public class Program_38 {
        public static void main(String[] args) {
            Point p1 = new Point(10, 20);
            Point p2 = new Point(p1);
            System.out.println("p2.x = " + p2.x);
        }
    }
    """,
        "Program_39.java": """
    // 39. Create a program that initializes class fields using a parameterized constructor.
    class Student {
        String name;
        Student(String name) { this.name = name; }
    }
    public class Program_39 {
        public static void main(String[] args) {
            Student s = new Student("Ravi");
            System.out.println("Name: " + s.name);
        }
    }
    """,
        "Program_40.java": """
    // 40. Write a program to demonstrate the use of static and non-static methods.
    class Counter {
        static int staticCount = 0;
        int instanceCount = 0;
        Counter() { staticCount++; instanceCount++; }
        static void showStatic() { System.out.println("Static count: " + staticCount); }
        void showInstance() { System.out.println("Instance count: " + instanceCount); }
    }
    public class Program_40 {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            c1.showInstance(); // 1
            Counter.showStatic(); // 1
        }
    }
    """,
        "Program_41.java": """
    // 41. Implement a singleton class in Java.
    class Singleton {
        private static final Singleton instance = new Singleton();
        private Singleton() {}
        public static Singleton getInstance() { return instance; }
    }
    public class Program_41 {
        public static void main(String[] args) {
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            System.out.println("s1 == s2 is " + (s1 == s2));
        }
    }
    """,
        "Program_42.java": """
    // 42. Write a program to demonstrate multilevel inheritance in Java.
    class A {}
    class B extends A {}
    class C extends B {}
    public class Program_42 {
        public static void main(String[] args) {
            C obj = new C();
            System.out.println("C is instance of A: " + (obj instanceof A));
        }
    }
    """,
        "Program_43.java": """
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
    """,
        "Program_44.java": """
    // 44. Implement an abstract class and override its methods in a subclass.
    abstract class Shape { abstract void draw(); }
    class Square extends Shape { @Override void draw() { System.out.println("Drawing Square"); } }
    public class Program_44 {
        public static void main(String[] args) { new Square().draw(); }
    }
    """,
        "Program_45.java": """
    // 45. Write a program to demonstrate final classes and methods.
    final class FinalClass {} // Cannot be subclassed
    class BaseWithFinal { final void show() {} } // Cannot be overridden
    public class Program_45 {
        public static void main(String[] args) { System.out.println("Final demo."); }
    }
    """,
        "Program_46.java": """
    // 46. Create a program to show run-time polymorphism using dynamic method dispatch.
    class Bank { float getRate() { return 0f; } }
    class HDFC extends Bank { float getRate() { return 8.5f; } }
    public class Program_46 {
        public static void main(String[] args) {
            Bank myBank = new HDFC(); // Superclass ref, subclass object
            System.out.println("Rate: " + myBank.getRate());
        }
    }
    """,
        "Program_47.java": """
    // 47. Write a program to reverse a string without using built-in methods.
    public class Program_47 {
        public static void main(String[] args) {
            String s = "hello";
            String reversed = "";
            for (int i = s.length() - 1; i >= 0; i--) reversed += s.charAt(i);
            System.out.println("Reversed: " + reversed);
        }
    }
    """,
        "Program_48.java": """
    // 48. Implement a program to count the frequency of characters in a string.
    import java.util.HashMap;
    public class Program_48 {
        public static void main(String[] args) {
            String s = "java";
            HashMap<Character, Integer> freq = new HashMap<>();
            for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
            System.out.println(freq);
        }
    }
    """,
        "Program_49.java": """
    // 49. Write a program to demonstrate the immutability of the String class.
    public class Program_49 {
        public static void main(String[] args) {
            String str = "Start";
            str.toUpperCase(); // Does not change str
            System.out.println("str is still: " + str);
        }
    }
    """,
        "Program_50.java": """
    // 50. Create a program to check if a given string is a palindrome.
    public class Program_50 {
        public static void main(String[] args) {
            String s = "level";
            String reversed = new StringBuilder(s).reverse().toString();
            System.out.println("Is palindrome? " + s.equals(reversed));
        }
    }
    """,
        "Program_51.java": """
    // 51. Implement a program to split a string into words and print each word on a new line.
    public class Program_51 {
        public static void main(String[] args) {
            String sentence = "Java is fun";
            String[] words = sentence.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
    """
    # ... Add any other programs here
}

def create_java_files(code_dict, folder="/Users/pranavsharma/Desktop/Amity/Class codes/Java/Module_1"):
    """
    Creates Java files from a dictionary of filenames and code.
    """
    os.makedirs(folder, exist_ok=True)

    for filename, code in code_dict.items():
        filepath = os.path.join(folder, filename)
        
        # The 'w' mode will overwrite the file if it already exists.
        with open(filepath, "w") as file:
            # .strip() removes leading/trailing whitespace from the code string.
            file.write(code.strip())
        
        print(f"Created: {filepath}")

# Execute the function to create all the files.
# Note: Your original script requested 50 files, but the list has 51 questions.
# This script will create all 51 files present in the dictionary.
create_java_files(java_codes)