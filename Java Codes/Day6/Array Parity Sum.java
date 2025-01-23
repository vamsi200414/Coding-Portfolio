import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter array size : ");
        int n = abc.nextInt();

        // Declare an array of size 'n'
        int[] arr = new int[n];

        // Read 'n' elements into the array
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = abc.nextInt();
        }

        // Print the entered array
        System.out.println("Entered array: " + Arrays.toString(arr));

        // Initialize variables to hold sums of odd and even numbers
        int oddnumbersum = 0;
        int evennumbersum = 0;

        // Iterate through the array to calculate sums
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                // Add to even number sum if the element is even
                evennumbersum += arr[i];
            } else {
                // Add to odd number sum if the element is odd
                oddnumbersum += arr[i];
            }
        }

        // Print the sums of odd and even numbers
        System.out.print("Sum of odd numbers: " + oddnumbersum + " ");
        System.out.println("Sum of even numbers: " + evennumbersum);
    }
}
