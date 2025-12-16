/* Hello World! program... */

// class hello {
//     public static void main(String[] args) { 
//         System.out.println("Hello World!");
//     }
// }

/* To take input from user.. */
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Taking input for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Taking input for a floating-point number
        System.out.print("Enter a floating-point number: ");
        float decimal = scanner.nextFloat();

        // Clearing the scanner buffer
        scanner.nextLine(); // Consumes the leftover newline character

        // Taking input for a string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Taking input for a single word
        System.out.print("Enter a single word: ");
        String word = scanner.next();

        // Display the inputs
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + number);
        System.out.println("Floating-point number: " + decimal);
        System.out.println("String: " + text);
        System.out.println("Single word: " + word);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
