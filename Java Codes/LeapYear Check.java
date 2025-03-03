import java.util.*; // Importing Scanner class

public class Main {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner abc = new Scanner(System.in);
        
        // Prompting user to enter a year
        System.out.print("Enter a year: ");
        int year = abc.nextInt(); // Reading input from user
        
        // Checking if the given year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year."); // Output if year is a leap year
        } else {
            System.out.println(year + " is NOT a Leap Year."); // Output if year is not a leap year
        }
        
        abc.close(); // Closing the Scanner object to prevent resource leak
    }
}
