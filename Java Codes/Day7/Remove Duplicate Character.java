import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner abc = new Scanner(System.in);
        
        // Read the entire line of input string
        String s = abc.nextLine();
        
        // Initialize an empty string to store unique characters
        String empty = "";

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Initialize a counter to track if the character is already in the empty string
            int count = 0;
            
            // Loop through the characters already added to the empty string
            for (int j = 0; j < empty.length(); j++) {
                // If the current character in string `s` is already in the `empty` string
                if (s.charAt(i) == empty.charAt(j)) {
                    // Increment the count and break out of the inner loop (no need to check further)
                    count++;
                    break;
                }
            }
            
            // If the character was not found in the empty string, add it to `empty`
            if (count == 0) {
                empty = empty + s.charAt(i);
            }
        }
        
        // Print the string containing only unique characters from the original string
        System.out.print(empty);
    }
}
