import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner abc = new Scanner(System.in);
        
        // Read two strings from the user
        String s1 = abc.nextLine(); // First string input
        String s2 = abc.nextLine(); // Second string input
        
        // Compare the first character of both strings
        if(s1.charAt(0) < s2.charAt(0)){
            // If the first character of s1 is lexicographically smaller than s2, print s1 followed by s2
            System.out.print(s1 + s2);
        }
        else{
            // Otherwise, print s2 followed by s1
            System.out.print(s2 + s1);
        }
    }
}
