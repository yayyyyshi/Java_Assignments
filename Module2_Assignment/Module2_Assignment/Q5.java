// Module 2 Assignment - Question 5
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        
        list.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted in descending order: " + list);
    }
}
