// 14. Implement a program to demonstrate the use of if-else, switch, and for loops.
    public class Program_14 {
        public static void main(String[] args) {
            int score = 85;
            if (score >= 90) System.out.println("Grade A");
            else System.out.println("Grade B or lower");

            int day = 3;
            switch (day) {
                case 1: System.out.println("Monday"); break;
                default: System.out.println("Some other day"); break;
            }

            for (int i = 0; i < 3; i++) System.out.println("Loop count: " + i);
        }
    }