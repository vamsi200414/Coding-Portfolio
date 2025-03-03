Given a floating-point number as a string, determine whether the last non-zero digit (ignoring trailing zeros) is EVEN or ODD.

   Input Format
       A single line containing a floating-point number as a string.
   Output Format
       Print "EVEN" if the last non-zero digit is even.
      Print "ODD" if the last non-zero digit is odd.

Code : 

import java.util.*; // Importing the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object for user input
        
        String s = abc.nextLine(); // Reading the floating-point number as a string
        
        // Traverse the string from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i); // Get the current character
            
            // Ignore trailing zeros and the decimal point
            if (c == '0' || c == '.') {
                continue;
            }
            
            // Convert character to an integer and check if it's even or odd
            if ((c - '0') % 2 == 0) {
                System.out.println("EVEN"); // Print EVEN if the last non-zero digit is even
            } else {
                System.out.println("ODD"); // Print ODD if the last non-zero digit is odd
            }
            break; // Exit the loop after finding the last non-zero digit
        }
        
        abc.close(); // Close the scanner to prevent resource leak
    }
}
