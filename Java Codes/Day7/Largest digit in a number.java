import java.util.*; // Importing the Scanner class for user input
public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        
        // Taking an integer input from the user
        int n = abc.nextInt();
        int dup = 0; // Variable to store the largest digit found
        
        // Loop to extract each digit and find the largest one
        while (n != 0) {
            int x = n % 10; // Extracting the last digit
            if (x > dup) {  // Checking if the current digit is greater than the stored largest digit
                dup = x;    // Updating the largest digit
            }
            n = n / 10; // Removing the last digit from the number
        }
        
        // Printing the largest digit in the number
        System.out.print(dup);
    }
}
