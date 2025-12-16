/* Introduction to Searching algorithm in an array */

import java.util.*;

// public class Search_in_Array {

//     public static int Linear_Search(int[] num, int key){
//         for(int i = 0;i < num.length;i++){
//             if(num[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }


//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // Linear Search..
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int num[] = new int[n];

//         for(int i = 0;i < n;i++){
//             num[i] = sc.nextInt();
//         }

//         System.out.println("The Following array is=> ");
//         for(int i = 0;i < n;i++){
//             System.out.print(num[i] + " ");
//         }
        
//         System.out.println();

//         System.out.print("Enter the key value to find in an array: ");
//         int key = sc.nextInt();

//      // Linear Search is mostly used for unsorted array.It is bit slower because of it's time complexity Big-O(n) => linear.

//         int Find_index = Linear_Search(num, key);
//         System.out.println("The key value find at the index " + Find_index);

//         sc.close();

//     }
// }


public class Search_in_Array {
    // Binary Search is use in sorted array mostly. It is faster and has less time complexity which is Big-O(log(n)) => logarithmic.. 
    public static int BinarySearch(int[] num, int key){
        int start = 0;
        int end = num.length - 1;

        while(start <= end){

            int mid_idx = start + (end - start) / 2;
    
            if(key == num[mid_idx]){
                return mid_idx;
            }
            else if(key > num[mid_idx]){
                start = mid_idx + 1;
            }
            else{
                end = mid_idx - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Linear Search..
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int num[] = new int[n];

        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("The Following array is=> ");
        for(int i = 0;i < n;i++){
            System.out.print(num[i] + " ");
        }
        
        System.out.println();

        System.out.print("Enter the key value to find in an array: ");
        int key = sc.nextInt();

        int Find_index = BinarySearch(num, key);

        System.out.println("The key value find at the index " + Find_index);

        sc.close();

    }
}

