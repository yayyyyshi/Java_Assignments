// Module 3 Assignment - Question 7
// Synchronized ticket booking to prevent overselling.

public class Q7 {
    static class TicketCounter {
        private int tickets;
        public TicketCounter(int tickets) { this.tickets = tickets; }
        public synchronized boolean bookTicket(String user) {
            if (tickets > 0) {
                tickets--;
                System.out.println(user + " booked a ticket. Remaining: " + tickets);
                return true;
            } else {
                System.out.println(user + " failed to book - sold out.");
                return false;
            }
        }
        public int remaining() { return tickets; }
    }

    public static void main(String[] args) throws InterruptedException {
        final TicketCounter counter = new TicketCounter(5);
        Runnable user = () -> {
            String name = Thread.currentThread().getName();
            while (counter.remaining() > 0) {
                boolean ok = counter.bookTicket(name);
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                if (!ok) break;
            }
        };

        Thread t1 = new Thread(user, "User-A");
        Thread t2 = new Thread(user, "User-B");
        Thread t3 = new Thread(user, "User-C");
        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();
        System.out.println("Booking finished.");
    }
}
