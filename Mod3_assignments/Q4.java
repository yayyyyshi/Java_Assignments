// Module 3 Assignment - Question 4
// One thread prints a countdown from 10 to 1 (1s delay), another prints "Tick..." every 0.5s concurrently.

public class Q4 {
    public static void main(String[] args) throws InterruptedException {
        Thread countdown = new Thread(() -> {
            try {
                for (int i = 10; i >= 1; i--) {
                    System.out.println("Countdown: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        });

        Thread tick = new Thread(() -> {
            try {
                int ticks = 0;
                while (ticks < 20) { // 20 ticks = 10 seconds
                    System.out.println("Tick...");
                    Thread.sleep(500);
                    ticks++;
                }
            } catch (InterruptedException e) {}
        });

        countdown.start();
        tick.start();
        countdown.join();
        tick.join();
        System.out.println("Finished");
    }
}
