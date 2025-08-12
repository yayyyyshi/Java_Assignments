// 38. Implement a program to demonstrate the use of a copy constructor in Java.
    class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        Point(Point other) { this.x = other.x; this.y = other.y; } // Copy constructor
    }
    public class Program_38 {
        public static void main(String[] args) {
            Point p1 = new Point(10, 20);
            Point p2 = new Point(p1);
            System.out.println("p2.x = " + p2.x);
        }
    }