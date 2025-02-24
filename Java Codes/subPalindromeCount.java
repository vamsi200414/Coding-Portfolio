import java.util.*;  // Importing necessary package

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating Scanner object for input
        String s = abc.nextLine(); // Taking user input as a string
        int n = s.length(); // Finding the length of the string
        int count = 0; // Initializing count to store the number of palindromes

        // Loop to get all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String ss = s.substring(i, j); // Extracting substring

                // Checking if the substring is a palindrome
                if (ss.length() > 1 && new StringBuilder(ss).reverse().toString().equals(ss)) {
                    System.out.println(ss); // Printing the palindrome
                    count++; // Incrementing the count
                }
            }
        }

        System.out.println(count); // Printing the total count of palindromes
        abc.close(); // Closing the scanner
    }
}
