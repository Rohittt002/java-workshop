//WAP for Collection Framework
import java.util.ArrayList;
import java.util.Collections;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Creating a list
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        // Sorting the list
        Collections.sort(list);

        // Displaying the sorted list
        System.out.println("Sorted list: " + list);
    }
}