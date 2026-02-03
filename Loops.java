/* Introduction to Loops in java.. */
/* Use of for loop.. */
import java.util.*;

// public class Loops {
//     public static void main(String[] args){
//         for(int i = 1;i <= 100;i++){
//             System.out.println("The value is " + i);
//         }
//         System.out.println("Ending of program .. ");
//     }
// }

// Question to print the no from 0 to 10

// public class Loops{
//     public static void main(String[] args){
//         // int idx = 0;

//         for(int idx = 0;idx <= 10;idx++){
//             System.out.print(idx + "\n");
//         }
//     }
// }

/* Use of while loops in java.... */

// public class Loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Make a choice: Enter the number:- ");
//         int choice = sc.nextInt();

//         while(choice <= 10){

//             System.out.println("The choice is less than 100!." + choice);
//             choice++;
//         }
//     }
// }

/* use of do while loop in java.. */

// public class Loops {
//     public static void main(String[] args){

//         int idx = 1;
//         do{
//             System.out.println(idx);
//             idx++;
//         } while(idx <= 10);//In the do-while loop the ; is compulsory else it will give an error.
//     }
// }

// // Question practice..
public class Loops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // System.out.println("enter the no of terms: ");
        // int n = sc.nextInt();

        // System.out.println("Provide a number: ");
        // int number = sc.nextInt();

        // int sum = 0;

        // for(int i = 0;i < n;i++){
        //     sum += number;
        //     number++;
        // }

        // System.out.println("The sum of numbers- " + sum);

        int x = 121;
        int backupX = x;
        String newnum = "";

        while(x != 0){
            int digit = x % 10;
            // System.out.print(digit);
            newnum += digit;
            x = x / 10;
            // System.out.print(x + " ");
        }System.out.println();
        
        // System.out.println(backupX);
        String checker = Integer.toString(backupX);

        System.out.println(newnum.equals(checker));
        sc.close();

    }
}

