// Introduction to 2 dimension array..
/* Matrix Format.. */
import java.util.*;

// public class TwoD_Arr {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // 2D array declaration..
//         System.out.print("Enter the no of rows: ");
//         int n = sc.nextInt();// no of rows..

//         System.out.print("Enter the no of columns: ");
//         int m = sc.nextInt();// no of columns..

//         int[][] number = new int[n][m];

//         // taking user input..
//         for(int i = 0;i < n;i++){
//             for(int j = 0;j < m;j++){
//                 number[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The 2-Dimension array:- ");
//         // for giving the output of the 2d array..
//         for(int i = 0;i < n;i++){
//             for(int j = 0; j < m;j++){

//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

/* Practice problem.. */

public class TwoD_Arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 2D array declaration..
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();// no of rows..

        System.out.print("Enter the no of columns: ");
        int m = sc.nextInt();// no of columns..

        int[][] number = new int[n][m];

        // taking user input..
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                number[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the Key value to find in matrix: ");
        int key_in_matrix = sc.nextInt();
        
        System.out.println("The 2-Dimension array:- ");
        // for giving the output of the 2d array..
        for(int i = 0;i < n;i++){
            for(int j = 0; j < m;j++){
                if(number[i][j] == key_in_matrix){
                    System.out.println("Key Value found at index value at row " + (i+1) + " and column " + (j+1));
                }
            }
        }
        
        sc.close();
    }
}

// Time complexity of 2D array is O(n^2)..