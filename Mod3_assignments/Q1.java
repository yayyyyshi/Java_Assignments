// Module 3 Assignment - Question 1
// Create a thread by extending the Thread class that prints even numbers from 2 to 20 with a 500ms delay between each number.

public class Q1 extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }
    public static void main(String[] args) {
        System.out.println("Output: even numbers 2..20 with 500ms delay");
        new Q1().start();
    }
}
