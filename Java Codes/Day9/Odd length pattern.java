import java.util.*; // Importing the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        String s = abc.nextLine(); // Reading a string input from the user
        
        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                // Print characters at diagonal positions
                if (i == j || j == s.length() - i - 1) {
                    System.out.print(s.charAt(i)); // Print the character at position 'i'
                } else {
                    System.out.print(" "); // Print space for non-diagonal positions
                }
            }
            System.out.println(); // Move to the next line after each row iteration
        }
    }
}
