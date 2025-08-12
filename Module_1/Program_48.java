// 48. Implement a program to count the frequency of characters in a string.
    import java.util.HashMap;
    public class Program_48 {
        public static void main(String[] args) {
            String s = "java";
            HashMap<Character, Integer> freq = new HashMap<>();
            for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
            System.out.println(freq);
        }
    }