// Module 3 Assignment - Question 6
// Daemon thread that auto-saves every 3 seconds while main simulates file processing.

public class Q6 {
    public static void main(String[] args) throws InterruptedException {
        Thread autoSave = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Auto-Save in progress...");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) { }
        });
        autoSave.setDaemon(true);
        autoSave.start();

        // Simulate file processing in main thread
        System.out.println("Main: Starting file processing...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: processing chunk " + i);
            Thread.sleep(1000);
        }
        System.out.println("Main: File processing done. Exiting main (daemon stops automatically).");
    }
}
