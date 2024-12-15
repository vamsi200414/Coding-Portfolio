import java.util.*;  // Import the Scanner class for taking user input

// Program name: square matrix - corner sum elements
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner abc = new Scanner(System.in);
        
        // Take the size of the square matrix as input
        int n = abc.nextInt();
        
        // Create a 2D array (matrix) of size n x n
        int[][] arr = new int[n][n];
        
        // Read the matrix elements from user input
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // Fill the matrix with user input values
                arr[i][j] = abc.nextInt();
            }
        }
        
        // Print the sum of the corner elements of the matrix
        // The corners are: arr[0][0], arr[0][n-1], arr[n-1][0], and arr[n-1][n-1]
        System.out.print(arr[0][0] + arr[0][n-1] + arr[n-1][0] + arr[n-1][n-1]);
    }
}
