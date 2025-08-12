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