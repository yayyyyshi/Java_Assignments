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