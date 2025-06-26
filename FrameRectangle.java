// write a code for printing  frame like rectangle.
import java.util.Scanner;
public class FrameRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Print the frame rectangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* "); // Print border
                } else {
                    System.out.print("  "); // Print space inside
                }
            }
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}