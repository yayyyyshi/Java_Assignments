// Module 3 Assignment - Question 2
// Create a thread by implementing the Runnable interface that takes a string "MULTITHREADING" and prints its characters in reverse order one by one.

public class Q2 implements Runnable {
    private final String text = "MULTITHREADING";
    public void run() {
        try {
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(text.charAt(i));
                if (i > 0) System.out.print(' ');
                Thread.sleep(150);
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
    public static void main(String[] args) {
        System.out.println("Output: characters of MULTITHREADING in reverse:");
        Thread t = new Thread(new Q2());
        t.start();
    }
}
