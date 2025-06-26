// 71. Write a Java program to clone one HashSet into another.
import java.util.*;
public class Clone_HashSet {
    public static void main(String[] args) {
        System.out.println("Rohit Lovevanshi, 0873AL231023(AIML)");
        
        // Creating the original HashSet and adding elements
        HashSet<String> originalHashSet = new HashSet<String>();
        originalHashSet.add("Apple");
        originalHashSet.add("Banana");
        originalHashSet.add("Orange");
        
        System.out.println("Original HashSet: " + originalHashSet);
        
        // Cloning the HashSet
        HashSet<String> clonedHashSet = (HashSet<String>) originalHashSet.clone();
        
        System.out.println("Cloned HashSet: " + clonedHashSet);
    }
}