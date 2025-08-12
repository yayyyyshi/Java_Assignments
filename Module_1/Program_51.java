// 51. Implement a program to split a string into words and print each word on a new line.
    public class Program_51 {
        public static void main(String[] args) {
            String sentence = "Java is fun";
            String[] words = sentence.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }