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