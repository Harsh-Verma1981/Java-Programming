/* Welcome to Data structures and algorithms */
// Introduction to 1D array..

import java.util.*;

// public class Arrays {
//     public static void main(String [] argh){
//         Scanner sc = new Scanner(System.in);

//         // syntax to create an array..
//         // datatype[] arrayname = new datatype[size of array]; ....
//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();

//         int marks_of_subjects[] = new int[n];// array defining ..

//     /* 
//         marks_of_subjects[0] = 100;
//         marks_of_subjects[1] = 98;
//         marks_of_subjects[2] = 99;

//     */

//     // for taking input in an array..
//         for(int i = 0;i < n;i++){
//             marks_of_subjects[i] = sc.nextInt();
//         }

//     // for printing the array 
        // for(int i = 0;i < marks_of_subjects.length;i++){
//             System.out.println("The value of array " + i + " : " + marks_of_subjects[i]);
//         }

//         sc.close();
//     }
// }

// // Question for linear search in an array..

public class Arrays {
    public static void main(String [] argh){
        Scanner sc = new Scanner(System.in);

        // syntax to create an array..
        // datatype[] arrayname = new datatype[size of array]; ....
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int marks_of_subjects[] = new int[n];// array declartaion and defination ..

    // for taking input in an array..
        for(int i = 0;i < n;i++){
            marks_of_subjects[i] = sc.nextInt();
        }

        System.out.print("Enter the no: ");
        int index_of_duplicate = sc.nextInt();// duplicate value index

    // for printing the array 
        for(int i = 0;i < marks_of_subjects.length;i++) {
            if(marks_of_subjects[i] == index_of_duplicate){
                System.out.println("the index value of duplicate value in an array is " + i);
                break;
            }

            else{
                System.out.println("No Douplicate values exists");
                break;
            }
        }

        sc.close();

    /* To calculate the no of digits of a number..
        int no = sc.nextInt();
        int count = 0;
        int digit;

        while(no != 0){
            digit = no % 10;// get the remainder value..
            count++;
            // sum += digit;// store the remainder value in sum..
            
            no = no/10;
        }
        System.out.print(count);
    */
    
    }
}
