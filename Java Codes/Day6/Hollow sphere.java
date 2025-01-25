import java.util.*; // Importing the Scanner class for user input
public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        
        // Taking an integer input for the size of the square pattern
        int n = abc.nextInt(); 
        
        // Outer loop to iterate through the rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to iterate through the columns
            for (int j = 1; j <= n; j++) {
                // Checking if the current position is on the border of the square
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"); // Printing '*' for border positions
                } else {
                    System.out.print(" "); // Printing a space for inner positions
                }
            }
            // Moving to the next line after completing a row
            System.out.println();
        }
    }
}
