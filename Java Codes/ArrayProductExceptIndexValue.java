import java.util.*; // Importing required package for Scanner and ArrayList

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object for user input

        // Reading the size of the array
        int size = abc.nextInt(); 
        
        int[] arr = new int[size]; // Declaring an array to store user input

        // Taking array input from the user
        for (int i = 0; i < size; i++) {
            arr[i] = abc.nextInt();
        }

        // Creating an ArrayList to store the product of elements
        ArrayList<Integer> al = new ArrayList<>();

        // Calculating the product of all elements except the current index
        for (int i = 0; i < size; i++) {
            int product = 1;
            for (int j = 0; j < size; j++) {
                if (i != j) { // Exclude the current element
                    product *= arr[j];
                }
            }
            al.add(product); // Store the computed product in the ArrayList
        }

        // Printing the resulting product array
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " "); // Print each product with a space
        }
    }
}
