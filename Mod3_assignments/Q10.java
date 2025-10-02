// Module 3 Assignment - Question 10
// Producer-consumer using wait() and notify()

import java.util.LinkedList;
import java.util.Queue;

public class Q10 {
    static class Drop {
        private final Queue<Integer> q = new LinkedList<>();
        private final int CAP = 5;
        public synchronized void put(int val) throws InterruptedException {
            while (q.size() == CAP) wait();
            q.offer(val);
            System.out.println("Produced: " + val);
            notifyAll();
        }
        public synchronized int take() throws InterruptedException {
            while (q.isEmpty()) wait();
            int v = q.poll();
            System.out.println("Consumed: " + v);
            notifyAll();
            return v;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Drop drop = new Drop();
        Thread producer = new Thread(() -> {
            try {
                for (int i=1;i<=10;i++) {
                    drop.put(i);
                    Thread.sleep(120);
                }
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i=1;i<=10;i++) {
                    drop.take();
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {}
        });

        producer.start(); consumer.start();
        producer.join(); consumer.join();
        System.out.println("Producer-consumer finished.");
    }
}
