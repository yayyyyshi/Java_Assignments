// Module 3 Assignment - Question 14
// Deadlock by acquiring two locks in opposite order, then fixed version using tryLock with timeout.

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class Q14 {
    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    static void deadlockDemo() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            lock1.lock();
            try { System.out.println("T1 acquired lock1"); Thread.sleep(100); lock2.lock(); System.out.println("T1 acquired lock2"); }
            catch (InterruptedException e) {} finally { if (lock1.isHeldByCurrentThread()) lock1.unlock(); if (lock2.isHeldByCurrentThread()) lock2.unlock(); }
        });

        Thread t2 = new Thread(() -> {
            lock2.lock();
            try { System.out.println("T2 acquired lock2"); Thread.sleep(100); lock1.lock(); System.out.println("T2 acquired lock1"); }
            catch (InterruptedException e) {} finally { if (lock2.isHeldByCurrentThread()) lock2.unlock(); if (lock1.isHeldByCurrentThread()) lock1.unlock(); }
        });

        t1.start(); t2.start();
        t1.join(1000); t2.join(1000);
        System.out.println("Potential deadlock demo finished (threads may be waiting).");
    }

    static void fixedDemo() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println("Fixed T1 got lock1, trying lock2");
                        if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try { System.out.println("Fixed T1 got lock2 too"); } finally { lock2.unlock(); }
                        } else System.out.println("Fixed T1 could not get lock2");
                    } finally { lock1.unlock(); }
                }
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println("Fixed T2 got lock2, trying lock1");
                        if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
                            try { System.out.println("Fixed T2 got lock1 too"); } finally { lock1.unlock(); }
                        } else System.out.println("Fixed T2 could not get lock1");
                    } finally { lock2.unlock(); }
                }
            } catch (InterruptedException e) {}
        });

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Deadlock fixed demo finished.");        
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running deadlock demo (may hang) then fixed demo:"); 
        deadlockDemo();
        fixedDemo();
    }
}
