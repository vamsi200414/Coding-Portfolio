import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Create a Scanner object for user input
        int n = abc.nextInt(); // Read an integer input for the number of rows in the pyramid

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for the current row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing spaces and stars
            System.out.println();
        }
    }
}
