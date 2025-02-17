import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner abc = new Scanner(System.in);

        // Read the size of the array from user input
        int size = abc.nextInt();
        int[] arr = new int[size];

        // Read 'size' number of elements into the array
        for (int i = 0; i < size; i++) {
            arr[i] = abc.nextInt();
        }

        // Print the input array for reference
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(); // Move to a new line after printing the array

        // Initialize 'max' and 'secmax' to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest numbers
        for (int i = 0; i < size; i++) {
            // If the current element is greater than 'max', update 'max' and 'secmax'
            if (arr[i] > max) {
                secmax = max; // Previous max becomes second max
                max = arr[i];  // Update max with the new largest value
            }
            // If the current element is less than 'max' but greater than 'secmax', update 'secmax'
            else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
        }

        // Print the second largest element
        // If no valid second largest element exists, print a message
        if (secmax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found");
        } else {
            System.out.println(secmax);
        }
    }
}
