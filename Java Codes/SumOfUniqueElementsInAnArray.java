import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Create Scanner object to take input

        // Read the size of the array from user input
        System.out.print("Enter the size of the array: ");
        int size = abc.nextInt();

        // Declare an array of given size
        int[] arr = new int[size];

        // Read array elements from user input
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = abc.nextInt();
        }

        // HashSet to store unique elements
        HashSet<Integer> hs = new HashSet<>();

        // HashSet to store duplicate elements
        HashSet<Integer> dup = new HashSet<>();

        // Iterate through the array to identify unique and duplicate elements
        for (int i = 0; i < size; i++) {
            // If the element is already in 'hs', add it to 'dup'
            if (!hs.add(arr[i])) {
                dup.add(arr[i]); // Store duplicate elements
            }
        }

        // Print the unique elements in the array
        System.out.println("Unique elements: " + hs);

        // Print the duplicate elements in the array
        System.out.println("Duplicate elements: " + dup);

        // Variable to store the sum of unique elements
        int sum = 0;

        // Iterate through the HashSet to calculate the sum of unique elements
        for (int i : hs) {
            sum = sum + i;
        }

        // Print the sum of unique elements
        System.out.println("Sum of unique elements: " + sum);
    }
}
