// Module 3 Assignment - Question 12
// Simulate file download in a thread and allow graceful stop via a flag.

public class Q12 {
    static class Downloader implements Runnable {
        private volatile boolean running = true;
        public void stop() { running = false; }
        public void run() {
            int chunk = 1;
            try {
                while (running && chunk <= 10) {
                    System.out.println("Downloading chunk " + chunk);
                    Thread.sleep(200);
                    chunk++;
                }
            } catch (InterruptedException e) {}
            System.out.println("Downloader stopped gracefully.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Downloader d = new Downloader();
        Thread t = new Thread(d);
        t.start();
        Thread.sleep(1000); // let it download some chunks
        d.stop();
        t.join();
        System.out.println("Main: download thread joined.");
    }
}
