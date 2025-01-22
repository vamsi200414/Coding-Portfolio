import java.util.*; // Importing the utility package for Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompt the user to input the number of rows for the pattern
        System.out.println("Enter the number of rows for the star pattern:");
        int n = abc.nextInt(); // Reading the input value for 'n'

        // Outer loop to handle the number of rows
        for (int i = 0; i <= n; i++) {
            // Inner loop to handle the number of stars in each row
            for (int j = 0; j <= i; j++) {
                // Condition to ensure the current column index is less than or equal to the row index
                if (j <= i) {
                    System.out.print("* "); // Printing a star followed by a space
                }
            }
            // Moving to the next line after printing all stars in a row
            System.out.println();
        }
    }
}
