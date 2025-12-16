
/* 
Pattern Ques using loops 
*/

// Solid Rect problem..

import java.util.Scanner;

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int row = sc.nextInt();// for no of rows

//         System.out.print("Enter the no of columns: ");
//         int colmn = sc.nextInt();// for no of columns 

//         for(int i = 0;i < row;i++){
//             for(int j = 0;j < colmn;j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }

//         /*

//          *****
//          *****
//          ***** The output
//          *****
         
//         */

//     }
// }

// // // Hollow Rectangle problem

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int row = sc.nextInt();// for no of rows

//         System.out.print("Enter the no of columns: ");
//         int colmn = sc.nextInt();// for no of columns 

//         for(int i = 1;i <= row;i++){
//             for(int j = 1;j <= colmn;j++) {
//                 if(i == 1 || j == 1 || i == row || j == colmn){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         /*

//          *****
//          *   *
//          *   * The output
//          *****
         
//         */

//     }
// }

// // Half Pyramid problem

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int n = sc.nextInt();// for no of rows

//         for(int i = 1;i <= n;i++){
//             for(int j = 1;j <= i;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         /*

//          *
//          **
//          ***
//          ****     The output
//          *****
         
//         */

//     }
// }

// // Inverted half Pyramid .. 

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int n = sc.nextInt();// for no of rows

//         for(int i = 1;i <= n;i++){
//             for(int j = n;j >= i;j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         /*

//          *****
//          ****
//          ***
//          **
//          *
//           The output
         
//         */

//     }
// }

// // Inverted half Pyramid 180 degree .. 

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int n = sc.nextInt();// for no of rows

//         for(int i = 1;i <= n;i++){
//             for(int j = 1;j <= n-i;j++) { // for space
//                 System.out.print(" ");
//             }

//             for(int j = 1;j <= i;j++){// for stars
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         /*

//             *
//            **
//           ***
//          ****     The output
//         *****

//         */

//     }
// }

// // Half Pyramid using numbers .. 

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int n = sc.nextInt();// for no of rows

//         for(int i = 1;i <= n;i++){
//             for(int j = 1;j <= i;j++) { // for space
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//         /*

//         1
//         12
//         123
//         1234     The output..
//         12345

//         */

//     }
// }

// // Inverted half pyramid using numbers.. 

// public class QuesLoop {
//     public static void main(String[] args){
//         // Beginning of logic for pattern problem..

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the no of Rows: ");
//         int n = sc.nextInt();// for no of rows

//         for(int i = n;i >= 1;i--){
//             for(int j = 1;j <= i;j++) { // for space
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//         /*

//         12345
//         1234     The output..
//         123     
//         12     
//         1    

//         */

//     }
// }

// // 0-1 Triangle.. 

public class QuesLoop {
    public static void main(String[] args){
        // Beginning of logic for pattern problem..

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of Rows: ");
        int n = in.nextInt();// for no of rows

        // int num = 1;

        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++) { // for space
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        /*

        1
        0,1     The output..
        1,0,1     
        0,1,0,1     
        1,0,1,0,1    

        */
        in.close();
    }
}

