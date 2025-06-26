// 52. Write a Java program to clone an array list to another array list.
import java.util.*;
public class Clone_Array {
    public static void main(String[] args) {
        System.out.println("Rohit Lovevanshi, 0873AL231023(AIML)");
        ArrayList<String> originalList = new ArrayList<String>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        // Cloning the array list
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        System.out.println("Original Array List: " + originalList);
        System.out.println("Cloned Array List: " + clonedList);
    }
}