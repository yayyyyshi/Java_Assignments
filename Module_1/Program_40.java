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