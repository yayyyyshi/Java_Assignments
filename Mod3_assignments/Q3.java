// Module 3 Assignment - Question 3
// Create a program that creates two threads. The first thread should print "Thread 1" every 1 second, and the second thread should print "Thread 2" every 2 seconds.

public class Q3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread 2");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        System.out.println("Done");
    }
}
