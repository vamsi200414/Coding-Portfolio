import java.util.*;  // Importing the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object for input

        // Prompting the user to enter a sentence
        System.out.println("Enter a sentence:");
        String s = abc.nextLine(); // Reading the entire input line as a string

        // Splitting the input string into words based on spaces
        String[] splitString = s.split(" "); 
        
        int count = 0; // Initializing a counter to track the number of articles

        // Iterating through each word in the split array
        for (int i = 0; i < splitString.length; i++) {
            String word = splitString[i]; // Storing the current word

            // Converting the word to lowercase to make the comparison case-insensitive
            word = word.toLowerCase();

            // Checking if the word is an article ("the", "a", or "an")
            if (word.equals("the") || word.equals("a") || word.equals("an")) {
                count++; // Incrementing the count if the word matches an article
            }
        }

        // Printing the total count of articles found in the input sentence
        System.out.println("Number of articles in the sentence: " + count);
    }
}
