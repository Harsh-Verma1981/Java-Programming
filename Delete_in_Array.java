// // Deletion operations in Array...

/* Deletion from 0th index.. */

import java.util.*;

// public class Delete_in_Array {
//     public static void  main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();

//         int word[] = new int[n];

//         for(int i = 0;i < n;i++){
//             word[i] = sc.nextInt();
//         }

//         // shifting the elements to it's next index..
//         for(int i = 0;i < n - 1;i++){
//             word[i] = word[i + 1];
//         }

//         // Reducing the size..
//         n--;

//         System.out.print("The Array after deleting the 0th index is: ");
//         for(int i = 0;i < n;i++){
//             System.out.print(word[i] + " ");
//         }

//         sc.close();
//     }
// }

/* Deletion from last index.. */

// public class Delete_in_Array {
//     public static void  main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();

//         int num[] = new int[n];

//         for(int i = 0;i < n;i++){
//             num[i] = sc.nextInt();
//         }

//         // Decrementing the size..
//         n--;

//         for(int i = 0;i < n;i++){
//             System.out.print(num[i] + " ");
//         }
        
//         sc.close();
//     }
// }

/* Deletion from the Specific position.. */
public class Delete_in_Array {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the index form which the element will delete: ");
        int index = sc.nextInt();

        // shifting the elements from user given index to it's next index..
        for(int i = index;i < n - 1;i++){
            num[i] = num[i + 1];
        }

        // decrementing the size..
        n--;

        for(int i = 0;i < n;i++){
            System.out.print(num[i] + " ");
        }

        sc.close();
    }
}
