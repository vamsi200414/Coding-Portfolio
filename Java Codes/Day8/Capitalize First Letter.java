Problem statement : Write a program to capitalize the first letter of every word in a sentence.
Example : 
         Input: "hello world from java"
         Output: "Hello World From Java"

Code : 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner abc = new Scanner(System.in);

        // Read a line of input from the user
        String s = abc.nextLine();

        // Split the input string into words based on spaces
        String[] ss = s.split(" ");

        // Use a StringBuilder to efficiently build the resulting string
        StringBuilder sb = new StringBuilder();

        // Loop through each word in the array
        for (int i = 0; i < ss.length; i++) {
            String word = ss[i]; // Get the current word from the array
            
            // Ensure the word is not empty before processing
            if (!word.isEmpty()) {
                // Capitalize the first letter of the word and append the rest of the word
                // Then, append a space after each processed word
                sb.append(Character.toUpperCase(word.charAt(0))) // Convert first character to uppercase
                  .append(word.substring(1)) // Append the rest of the word as is
                  .append(" "); // Append a space after the word
            }
        }

        // Output the final result, removing any trailing space
        System.out.print(sb.toString().trim());
    }
}
