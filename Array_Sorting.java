/*Sorting algorithm using arrays in java programming. */
// // Bubble Sort in an array..

import java.util.*;

// public class Array_Sorting {
// // Time complexity of bubble sort is Big-O(n^2); 
//     public static void printArray(int arr[]){
//         for(int i = 0;i < arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();

//         int []arr_sort = new int[n];

//         System.out.println("Input Values: ");
//         for(int i = 0;i < n;i++){
//             arr_sort[i] = sc.nextInt();
//         }

//         // Implementation of bubble sort..

//         for(int i = 0;i < arr_sort.length - 1;i++){
//             for(int j = 0;j < arr_sort.length - i - 1;j++){
//                 // Swapping of elements with it's adjacent element..
//                 if(arr_sort[j] > arr_sort[j+1]){
//                     int temp = arr_sort[j];
//                     arr_sort[j] = arr_sort[j+1];
//                     arr_sort[j+1] = temp;
//                 }
//             }
//         }

//         System.out.println("The elements of array are: ");
        
//         printArray(arr_sort);
//         sc.close();
//     }
// }

// // Selection Sort in an array..

// public class Array_Sorting {
//     // Time complexity of Selection sort is Big-O(n^2); 
//         public static void printArray(int arr[]){
//             for(int i = 0;i < arr.length;i++){
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
    
//         public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
    
//             System.out.print("Enter the size: ");
//             int n = sc.nextInt();
    
//             int []arr = new int[n];
    
//             System.out.println("Input Values: ");
//             for(int i = 0;i < n;i++){
//                 arr[i] = sc.nextInt();
//             }
    
//             // Implementation of Selection sort..
    
//             for(int i = 0;i < arr.length - 1;i++){
//                 int smallest = i;
//                 for(int j = i+1;j < arr.length;j++){
//                     if(arr[smallest] > arr[j]){
//                         smallest = j;
//                     }
//                 }
//                 int temp = arr[smallest];
//                 arr[smallest] = arr[i];
//                 arr[i] = temp;
//             }
    
//             System.out.println("The elements of array are: ");
            
//             printArray(arr);
//             sc.close();
//         }
//     }

// // Insertion Sorting approach in arrays..

public class Array_Sorting {
    // Time complexity of bubble sort is Big-O(n^2); 
        public static void printArray(int arr[]){
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
    
            int []arr_sort = new int[n];
    
            System.out.println("Input Values: ");  
            for(int i = 0;i < n;i++){
                arr_sort[i] = sc.nextInt();
            }
    
            // Implementation of Insertion sort..
    
            for(int i = 1;i < arr_sort.length;i++){
                int current  = arr_sort[i];
                int j = i-1;

                while(j >= 0 && current < arr_sort[j]){
                    arr_sort[j+1] = arr_sort[j];
                    j--;
                }
                
                // placement..
                arr_sort[j+1] = current;
            }

            System.out.println("The elements of array after sorting are: ");
            
            printArray(arr_sort);
            
            sc.close();
        }
    }