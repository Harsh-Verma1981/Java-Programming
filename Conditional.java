/* Basic java syntax for printing the String... */

// public class Conditional {
//     public static void main(String[] args){
//         System.out.println("Hii Harsh is learning Java");
//     }
// }

import java.util.*;

// public class Conditional {
//     public static void main(String[] args){

//         // to take input .. 
//         Scanner sc = new Scanner(System.in);
        // // Conditional statements..

        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();        

        // if(age > 18) {
        //     System.out.println("You are Adult.\nYou can vote");
        // }
        // else{
        //     System.out.println("Sorry You must be greater or be 18 years old!");
        // }


        // System.out.println("Enter the number: ");
        // int checkno = sc.nextInt();

        // if(checkno % 2 == 0){
        //     System.out.print("The no " + checkno + " is even");
        // }
        // else{
        //     System.out.println("The no " + checkno + " is odd.");
        // }


        // System.out.print("Enter the date: ");
        // int date = sc.nextInt();

        // System.out.print("Enter the month: ");
        // int month = sc.nextInt();

        // System.out.print("Enter the year: ");
        // int year = sc.nextInt();

        // if(date == 28 & month == 9 & year == 2005){
        //     System.out.println(date + "-"+ month + "-" + year + " is my birth date.");
        // }
        // else if(date == 19 & month == 11 & year == 2005){
        //     System.out.println(date + "-" + month + "-" + year + " is my parents anniversary.");
        // }
        // else {
        //     System.out.println("It is a normal day!");
        // }

//     }
// }

public class Conditional{
    public static void main(String[] args){
        // System.out.println();

        // Switch Case statement .. 
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a Card: ");
        String card = sc.nextLine();

        switch (card) {
            case "Ace":
                System.out.println("You picked a Ace Card!");
                break;

            case "King":
                System.out.println("You picked a King Card!");
                break;

            case "Queen":
                System.out.println("You picked a Queen card!");
                break;

            case "Joker":
                System.out.println("You picked a Joker Card!");
                break;

            default:
                System.out.println("A number card was picked");
                break;

            }
        sc.close();
    }
}

// import java.util.Scanner;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input: Monthly rent and lease duration
//         int monthlyRent = sc.nextInt();
//         int leaseDuration = sc.nextInt();

//         // Calculate the total cost
//         int totalCost = monthlyRent * leaseDuration;

//         // Output the total cost
//         System.out.println("Total Cost: " + totalCost);

//         // Determine payment method suggestion using a switch-case..
//         String paymentSuggestion;
//         switch (totalCost <= 1000 ? 1 : (totalCost <= 5000 ? 2 : 3)) {
//             case 1:
//                 paymentSuggestion = "Payment by cash or check is recommended.";
//                 break;
//             case 2:
//                 paymentSuggestion = "Payment by credit card is recommended.";
//                 break;
//             case 3:
//                 paymentSuggestion = "Payment by bank transfer is recommended.";
//                 break;
//             default:
//                 paymentSuggestion = "Invalid payment method suggestion.";
//         }

//         // Output the payment suggestion
//         System.out.println("Payment Method Suggestion: " + paymentSuggestion);

//         sc.close();
//     }
// }
