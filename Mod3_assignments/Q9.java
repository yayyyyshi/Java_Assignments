// Module 3 Assignment - Question 9
// Simple deadlock example with two resources (chopsticks) and two philosophers creating deadlock.

public class Q9 {
    static class Chopstick { }
    public static void main(String[] args) throws InterruptedException {
        final Chopstick c1 = new Chopstick();
        final Chopstick c2 = new Chopstick();

        Thread p1 = new Thread(() -> {
            synchronized (c1) {
                System.out.println("Philosopher 1 picked up c1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (c2) {
                    System.out.println("Philosopher 1 picked up c2");
                }
            }
        });

        Thread p2 = new Thread(() -> {
            synchronized (c2) {
                System.out.println("Philosopher 2 picked up c2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (c1) {
                    System.out.println("Philosopher 2 picked up c1");
                }
            }
        });

        p1.start(); p2.start();
        p1.join(1000); p2.join(1000); // may deadlock; we timeout to demonstrate
        System.out.println("Demo end (if deadlock occurred, threads would be waiting).");
    }
}
