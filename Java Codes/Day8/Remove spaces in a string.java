import java.util.*;  // Importing utility package for Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);  // Create Scanner object for user input
        String s = abc.nextLine();            // Read input string from the user

        // Create a StringBuilder object from the input string
        StringBuilder sb = new StringBuilder(s);

        // Loop through the StringBuilder to check each character
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);  // Get the character at the current index
            if (ch == ' ') {         // If the character is a space
                sb.deleteCharAt(i);  // Remove the space from the StringBuilder
            }
        }

        // Print the modified string (spaces removed)
        System.out.print(sb);
    }
}
