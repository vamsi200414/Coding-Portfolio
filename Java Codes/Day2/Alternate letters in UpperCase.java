import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner abc = new Scanner(System.in);

        // Read the input string entered by the user
        String a = abc.nextLine();

        // Convert the entire input string to uppercase
        String s = a.toUpperCase();

        // Split the string into an array of words using space as the delimiter
        String[] data = s.split(" ");

        // Initialize an empty string to hold the final result
        String result = "";

        // Loop through each word in the array of words
        for (int i = 0; i < data.length; i++) {
            String word = data[i];  // Get the word at the current index

            // Create a StringBuilder to build the processed word
            StringBuilder sb = new StringBuilder();

            // Loop through each character of the current word
            for (int j = 0; j < word.length(); j++) {
                // Get the character at the current position
                char ch = word.charAt(j);

                // Check if the index is odd (we want to make odd indices lowercase)
                if (j % 2 != 0) {
                    ch = Character.toLowerCase(ch);  // Convert to lowercase
                }
                
                // Append the character to the StringBuilder (either uppercase or lowercase)
                sb.append(ch);
            }

            // Add the processed word to the result string, followed by a space
            result = result + sb.toString() + " ";
        }

        // Print the final result string, which contains all words with alternating letter cases
        System.out.print(result);
    }
}
