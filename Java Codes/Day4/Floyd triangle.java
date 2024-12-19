import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner abc = new Scanner(System.in);
        
        // Read the number of rows for the triangle
        int n = abc.nextInt();
        
        // Variable to keep track of the next number to print
        int x = 1;
        
        // Outer loop to handle the rows of the triangle
        for (int i = 0; i < n; i++) {
            // Inner loop to handle the number of elements in each row
            for (int j = 0; j <= i; j++) {
                // Print the current number followed by a space
                System.out.print(x + " ");
                
                // Increment the number to print the next one
                x++;
            }
            
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}
