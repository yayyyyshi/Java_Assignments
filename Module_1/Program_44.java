// 44. Implement an abstract class and override its methods in a subclass.
    abstract class Shape { abstract void draw(); }
    class Square extends Shape { @Override void draw() { System.out.println("Drawing Square"); } }
    public class Program_44 {
        public static void main(String[] args) { new Square().draw(); }
    }