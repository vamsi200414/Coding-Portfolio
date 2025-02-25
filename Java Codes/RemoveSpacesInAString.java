import java.util.*; // Importing Java utility package for Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in); // Creating a Scanner object for user input

        // Reading the entire input line (including spaces)
        String s = abc.nextLine();

        // Removing all spaces from the string using replaceAll()
        s = s.replaceAll(" ", "");

        // Printing the modified string without spaces
        System.out.print(s);
    }
}
