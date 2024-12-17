import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner abc = new Scanner(System.in);
        
        // Read the lower bound (n1) and upper bound (n2) from the user input
        int n1 = abc.nextInt();
        int n2 = abc.nextInt();
        
        // Variable to track if a number has divisors
        int count = 0;
        
        // Variable to track the number of prime numbers in the range
        int tc = 0;

        // Loop through each number from n1 to n2 (inclusive)
        for (int i = n1; i <= n2; i++) {
            
            // Skip checking number 1 as it is not prime
            if (i == 1) {
                continue;
            }

            // Reset count for each number
            count = 0;

            // Loop from 2 to i-1 to check if i is divisible by any number
            for (int j = 2; j < i; j++) {
                // If i is divisible by j, it is not prime
                if (i % j == 0) {
                    count++; // Increment count if a divisor is found
                    break;   // No need to check further, exit the loop
                }
            }

            // If count is still 0, then i is prime
            if (count == 0) {
                tc++; // Increment prime number count
            }
        }

        // Output the total number of prime numbers found in the range
        System.out.print(tc);
    }
}
