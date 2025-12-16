
/*
Using of
    functions
        in java..
*/

/* These types of functions in java is int,boolean,float,double,char,String is returning some value 
meanwhile void function is use to not return any value or argument */

import java.util.*;
// import java.math.*;
// import java.io.*;

// public class Function {

//     public static void SumofArgs(int val1, int val2){ // Func declaration and Func definition..
//         int sum = val1 + val2;
//         System.out.println("The addition of two arguments: " + sum);
//         return;// In java we need to use the return either the function is void..
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the value for arguemnt 1: ");
//         int attr1 = sc.nextInt();

//         System.out.print("Enter the value for argument 2: ");
//         int attr2 = sc.nextInt();

//         SumofArgs(attr1, attr2);
//     }
// }

// // Factorial of a number....

// public class Function {

//     public static int Factorial(int val1){
        
//         if(val1 <= 1){
//             System.out.println(1);
//             // return;
//         }

//         int fact = 1;
//         for(int i = val1;i >= 1;i--){
//             fact *= i;
//         }
        
//         return fact;
        
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the value for arguemnt: ");
//         int attr1 = sc.nextInt();

//         System.out.println("The factorial: "+Factorial(attr1));

//         // for practice..

//         sc.nextLine(); /* to consume the reading leftover,
//          and provide the newline to read the string which is giving by user..
//         */

//         String s = sc.nextLine();
//         System.out.println("String: " + s);

//     }
// }

/*

Sample codes to learning new 
    things in java..

*/

// public class Function {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
        

//         int t = sc.nextInt();// no of terms of input.. 

//         for(int i = 0; i < t;i++){

//             int a = sc.nextInt();// variable to be added with the pow of b..
//             int b = sc.nextInt();// base value..
//             int n = sc.nextInt();// max expo value..

//             int sum = 0;

//             for(int j = 1;j <= n;j++){
//                 double getPow = Math.pow(b, j);
//                 sum += a + (int)getPow;
//                 System.out.print(sum + " ");
//             }
            
//         }

//     }
// }


/* HackerRank 
            loops-II Solution.. */

// public class Function{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();// no of terms of input..
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();// variable to add  with the powers of b
//             int b = in.nextInt();// variable to get the powers upto n
//             int n = in.nextInt();// pow variable..
            
//             // Solution..
//             for(int j = 1;j <= n;j++){
//                 a = a + b;
//                 System.out.print(a + " ");
//                 b = b * 2;
//             }
//             System.out.println();
//         }
        
        
//         in.close();
//     }
// }

public class Function{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int a = 1;
        int c = 10;

        int b = in.nextInt();

        int getvalue = (a + c) / 2;

        // boolean condition = true;
        String checker = (b == getvalue) ? "b\n" : "getvalue" ;
        System.out.println(checker);



        in.close();

    }
}

