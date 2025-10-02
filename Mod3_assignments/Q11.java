// Module 3 Assignment - Question 11
// Two threads print numbers 1..20 alternately: odd and even using wait/notify.

public class Q11 {
    private final Object lock = new Object();
    private int num = 1;

    public static void main(String[] args) throws InterruptedException {
        new Q11().runDemo();
    }

    public void runDemo() throws InterruptedException {
        Thread odd = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (num > 20) break;
                    if ((num & 1) == 1) {
                        System.out.println("Odd: " + num);
                        num++;
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        });

        Thread even = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (num > 20) break;
                    if ((num & 1) == 0) {
                        System.out.println("Even: " + num);
                        num++;
                        lock.notify();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        });

        odd.start(); even.start();
        odd.join(); even.join();
        System.out.println("Alternate printing done.");
    }
}
