import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner abc = new Scanner(System.in);
        
        // Read the entire line of input string
        String s = abc.nextLine();
        
        // Initialize variables to store the largest and second largest characters
        char largest = '\0', slargest = '\0';

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Get the character at index i
            char ch = s.charAt(i);
            
            // If the current character is larger than the largest character
            if (ch > largest) {
                // Update second largest to the previous largest
                slargest = largest;
                // Update largest to the current character
                largest = ch;
            }
            // If the current character is smaller than largest but larger than second largest
            else if (ch < largest && ch > slargest) {
                // Update second largest to the current character
                slargest = ch;
            }
        }
        
        // Print the second largest character found
        System.out.print(slargest);
    }
}
