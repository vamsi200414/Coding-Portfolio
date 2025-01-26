import java.util.*; // Importing the required package for Scanner and other utilities

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner abc = new Scanner(System.in);

        // Read a line of input from the user
        String s = abc.nextLine();

        // Split the input string into words based on spaces
        String[] ss = s.split(" ");

        // Initialize variables to track the longest word and its length
        int max = 0;
        String dup = "";

        // Loop through each word in the array
        for (int i = 0; i < ss.length; i++) {
            String word = ss[i]; // Get the current word

            // Check if the current word is longer than the previously recorded max length
            if (word.length() > max) {
                dup = word; // Update the longest word
                max = word.length(); // Update the max length
            }
        }

        // Print the longest word in the input string
        System.out.print(dup);
    }
}
