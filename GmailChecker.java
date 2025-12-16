import java.util.*;

public class GmailChecker {

    public static void IsValidGmail(String mail) {
        // Rules for a valid Gmail ID
        /*
         * The email must contain exactly one '@'.
         * It must not start with '@'.
         * It can contain uppercase, lowercase, and digits.
         * It must contain at least 2 digits.
         * It must end with "@gmail.com".
         * It must not include special characters except '@' and '.'
         */

        // Check if it starts with '@'
        if (mail.charAt(0) == '@') {
            System.out.println("Error: Gmail ID cannot start with '@'.");
            return;
        }

        // Check if it ends with "@gmail.com"
        if (!mail.endsWith("@gmail.com")) {
            System.out.println("Error: Gmail ID must end with '@gmail.com'.");
            return;
        }

        // Count '@' occurrences and number count
        int atCount = 0;int numCount = 0;
        String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.@";
        
        for (char c : mail.toCharArray()) {// toCharArray() method is been using to convert the given string chars into the array
            if (c == '@') {
                atCount++;
            }

            if (Character.isDigit(c)) {// Character.isDigit() method is been using to check if the given char value is numeric or not 
                numCount++;
            }

            // Check for invalid special characters
            if (validChars.indexOf(c) == -1) { // indexOf() method is been using to check the char value if value is not present or != given char value it return -1
                System.out.println("Error: Gmail ID has invalid special characters.");
                return;
            }

        }

        // Check if '@' appears exactly once..
        if (atCount != 1) {
            System.out.println("Error: Gmail ID must contain exactly one '@'.");
            return;
        }

        // Check if it contains at least 2 digits
        if (numCount < 2) {
            System.out.println("Error: Gmail ID must contain at least 2 digits.");
            return;
        }

        System.out.println(mail + " is a valid Gmail ID.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Gmail ID: ");
        String gmail = sc.nextLine();

        IsValidGmail(gmail); // Function call to check validity

        sc.close();
    }
}