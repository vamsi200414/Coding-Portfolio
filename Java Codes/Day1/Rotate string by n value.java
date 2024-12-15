import java.util.*;  // Importing the Scanner class to take user input

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);  // Creating a Scanner object to read input from the user
        
        // Take the input string from the user
        String s = abc.nextLine();  
        
        // Take the number of positions to rotate the string by
        int l = abc.nextInt(); 
        
        // Calculate the effective rotation number (to handle cases where rotation is greater than the string length)
        int rotate = l % s.length(); 
        
        // Perform the string rotation by splitting the string and concatenating in the rotated order
        // The rotated string is constructed by:
        // - Taking the last 'rotate' characters using substring(s.length()-rotate)
        // - Taking the remaining part of the string from the start up to 's.length()-rotate'
        System.out.print(s.substring(s.length() - rotate) + s.substring(0, s.length() - rotate));
    }
}
