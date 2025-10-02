// Module 3 Assignment - Question 13
// ReentrantLock counter vs non-locked counter.

import java.util.concurrent.locks.ReentrantLock;

public class Q13 {
    static class CounterNoLock {
        int c = 0;
        void inc() { c++; }
    }
    static class CounterWithLock {
        int c = 0;
        ReentrantLock lock = new ReentrantLock();
        void inc() {
            lock.lock();
            try { c++; } finally { lock.unlock(); }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int THREADS = 10, INCREMENTS = 1000;
        CounterNoLock noLock = new CounterNoLock();
        Thread[] t1 = new Thread[THREADS];
        for (int i=0;i<THREADS;i++) t1[i]=new Thread(() -> { for (int j=0;j<INCREMENTS;j++) noLock.inc(); });
        for (Thread t: t1) t.start();
        for (Thread t: t1) t.join();
        System.out.println("NoLock count (expect < " + (THREADS*INCREMENTS) + " due to race): " + noLock.c);

        CounterWithLock withLock = new CounterWithLock();
        Thread[] t2 = new Thread[THREADS];
        for (int i=0;i<THREADS;i++) t2[i]=new Thread(() -> { for (int j=0;j<INCREMENTS;j++) withLock.inc(); });
        for (Thread t: t2) t.start();
        for (Thread t: t2) t.join();
        System.out.println("WithLock count (expect " + (THREADS*INCREMENTS) + "): " + withLock.c);
    }
}
