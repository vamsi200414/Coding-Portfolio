Question : Given a number, the task is to find if the number is divisible by 9 or not. The input number may be large and it may not be possible to store even if we use long long int.



import java.util.*;  // Importing the Scanner class for user input

public class Main {  
    public static void main(String[] args) {  
        // Creating a Scanner object to take input from the user
        Scanner abc = new Scanner(System.in);  

        // Taking the number as a string input (to handle large numbers)
        String s = abc.nextLine();  

        // Variable to store the sum of digits
        int sum = 0;  

        // Loop through each character in the string
        for(int i = 0; i < s.length(); i++) {  
            // Convert character to integer and add it to sum
            sum = sum + (s.charAt(i) - '0');  
        }  

        // Check if the sum of digits is divisible by 9
        if(sum % 9 == 0) {  
            System.out.println("yes");  // If divisible by 9, print "yes"
        } else {  
            System.out.println("No");   // Otherwise, print "No"
        }  

        // Closing the scanner object to prevent memory leaks
        abc.close();  
    }  
}  
