import java.util.*; // Import the java.util package for using Scanner

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Create a Scanner object for user input
        int s = abc.nextInt(); // Read an integer input for the size of the pattern

        // Outer loop to handle the number of rows
        for (int i = s; i >= 1; i--) {
            // Inner loop to handle the number of columns
            for (int j = 1; j <= i; j++) {
                // Print star followed by a space
                System.out.print("* ");
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}
