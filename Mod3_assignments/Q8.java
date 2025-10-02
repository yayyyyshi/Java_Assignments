// Module 3 Assignment - Question 8
// Inventory decremented by multiple threads using synchronized block.

public class Q8 {
    static class Inventory {
        private int stock;
        public Inventory(int stock) { this.stock = stock; }
        public void decrease(String buyer) {
            synchronized (this) {
                if (stock > 0) {
                    stock--;
                    System.out.println(buyer + " bought 1. Stock now: " + stock);
                } else {
                    System.out.println(buyer + " attempted to buy but out of stock.");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Inventory inv = new Inventory(4);
        Runnable buyer = () -> {
            String name = Thread.currentThread().getName();
            for (int i=0;i<3;i++) {
                inv.decrease(name);
                try { Thread.sleep(150); } catch (InterruptedException e) {}
            }
        };

        Thread b1 = new Thread(buyer, "Buyer-1");
        Thread b2 = new Thread(buyer, "Buyer-2");
        b1.start(); b2.start();
        b1.join(); b2.join();
        System.out.println("Inventory simulation complete.");
    }
}
