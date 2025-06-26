// Garbage collection
// Demonstration of Garbage Collection in Java
public class GarbageCollect {
    public static void main(String[] args) {
        // Create an object of the class
        GarbageCollect gc = new GarbageCollect();
        
        // Nullify the reference to the object
        gc = null;
        
        // Request garbage collection
        System.gc();
        
        // Print a message indicating that garbage collection has been requested
        System.out.println("Garbage collection requested.");
    }

    @Override
    protected void finalize() throws Throwable {
        // This method is called by the garbage collector before reclaiming the object's memory
        System.out.println("Garbage collector is reclaiming the object.");
    }
}