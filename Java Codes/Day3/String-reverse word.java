import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner abc = new Scanner(System.in);

        // Read the input string
        String s = abc.nextLine();

        // Split the input string by spaces to separate individual words
        String[] data = s.split(" ");

        // Create a StringBuilder to construct the reversed sentence
        StringBuilder sb = new StringBuilder();

        // Loop through the words array from the last word to the first
        for (int i = data.length - 1; i >= 0; i--) {
            String word = data[i];

            // Append the word to the StringBuilder, followed by a space
            sb.append(word + " ");
        }

        // Print the reversed sentence after trimming any extra trailing space
        System.out.print(sb.toString().trim());
    }
}
