// Module 3 Assignment - Question 5
// Create three threads with different priorities and print messages showing execution attempts.

public class Q5 {
    public static void main(String[] args) throws InterruptedException {
        Runnable work = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " executing step " + i + " (priority " + Thread.currentThread().getPriority() + ")");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        };

        Thread w1 = new Thread(work, "Worker-1");
        Thread w2 = new Thread(work, "Worker-2");
        Thread w3 = new Thread(work, "Worker-3");

        w1.setPriority(Thread.MIN_PRIORITY); // 1
        w2.setPriority(Thread.NORM_PRIORITY); // 5
        w3.setPriority(Thread.MAX_PRIORITY); // 10

        w1.start(); w2.start(); w3.start();
        w1.join(); w2.join(); w3.join();
        System.out.println("All workers finished");
    }
}
