/* Basic Boilerplate code */

// public class program1 {
//     public static void main(String[] args){
//         System.out.println("Hello Neo! Time to wake up.");
//         System.out.println("Matrix is coming Neo! ");
//         System.out.println("Choice is yours.\nEither take the Freedom or take the Slavery.");
//     }
// }

/* variables and datatypes in Java.. */

// public class program1 {
//     public static void main(String[] args){
//         // variable..
//         int var_1 = 10;
//         // float value = 50.09;
//         double price = 508.89;
//         int var_2 = 20;
//         String name = "Family";
        
//         int sum_of_var = var_1 + var_2;
//         int minus = var_2 - var_1;
//         int product = var_1 * var_2;
        
//         System.out.println(sum_of_var);
//         System.out.println(minus);
//         System.out.println(product);

//         // In java there is no BODMAS rule..
//         /* 
//             *,/,% has the higher priority than +,-
//         */
//         System.out.println("Hello" + " " + name);
//         System.out.println(var_1 * var_2 / var_1 - var_2);// 10 * 20 = 200 / 10 = 20 - 20 = 0 .. i.e. the naswer is zero...

//     }
// }

/* Input from user.. */

// import java.util.*;

// public class program1 {
//     public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
        
//             System.out.print("Enter the name of a person: ");
//             String person = sc.nextLine();// to get the string input from user .. 
        
//             System.out.println("Enter the age of person: ");
//             int age = sc.nextInt();// to get the integer input from user....
        
//             System.out.println("Enter the Salary of the person: ");
//             double salary = sc.nextDouble();// to get the double value input from user .. 
        
//             System.out.println(person);
//             System.out.println(age);
//             System.out.println(salary);
        
//             int a = sc.nextInt();
//             int b = sc.nextInt();
        
//             int sum = a + b;
//             System.out.println(sum);

//             char vowel = sc.next().charAt(0);// to get a char value from user in java..
        
//             System.out.println("The entered vowel is " + vowel);

//     }
// }

/* Practice.. */

// import java.util.*;

// public class program1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the No: ");
//         int value = sc.nextInt();

//         System.out.println("The Original value is " + value);// Original value 
//         System.out.println("The Decremental value is " + --value);// Decremental value 
//         value++;
//         System.out.println("The Incremental value is " + ++value);// incremental value

        
//     }
// }

/* Conversion of two digit number into three digit number using String format.. */
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        String threedigit = String.format("%03d",i);
        
        // scan.close();

        // Write your code here.
        
        System.out.println("Int: " + i);
        System.out.println("Three-Digit Value of i: " + threedigit);

        sc.close();
    }
}