// // Insertion operation in an array..

/* Insertion of an element in beginning of an array.. */
import java.util.*;

// public class Insert_in_Arr {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of an array: ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         // taking array elements..
//         for(int i = 0;i < size;i++){
//             arr[i] = sc.nextInt();
//         }
        
//         // inputing new value to insert at 0th index in a new array..
//         System.out.print("Enter the new value to insert at index 0: ");
//         int new_value = sc.nextInt();

//         // making new array with size + 1 bcs array are static in nature so the size can't be changed..
//         int SmplArr[] = new int[size + 1];

//         // assigning SmplArr[0th index value] to new_value..
//         SmplArr[0] = new_value;

//         // copying arr[i] elements into SmplArr[i] from arr[0th index] to transfer it to SmplArr[1st index]..
//         for(int i = 0;i < size;i++){
//             SmplArr[i + 1] = arr[i];// SmplArr[1] = arr[0] .. it will increment the index accordingly.
//         }

//         System.out.println("New Array with new size is: ");
//         for(int i = 0;i < SmplArr.length;i++){
//             System.out.print(SmplArr[i] + " ");// printing the new array with a new element at 0th index..
//         }

//         sc.close();

//     }
// }

/* Insertion of a elemnt in last index in an array.. */

// public class Insert_in_Arr {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of an array: ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         // taking array elements..
//         for(int i = 0;i < size;i++){
//             arr[i] = sc.nextInt();
//         }
        
//         int newArr[] = new int[size + 1];// new array with incremental size..

//         System.out.print("Enter the new value to be insert at last index: ");
//         int element = sc.nextInt();

//         newArr[size] = element;

//         for(int i = 0;i < size;i++){
//             newArr[i] = arr[i];
//         }
         
//         System.out.println("The new array is, ");
//         for(int i = 0;i < newArr.length;i++){
//             System.out.print(newArr[i] + " ");
//         }

//         sc.close();

//     }
// }

/* Insertion at specific position in an array.. */

public class Insert_in_Arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // taking array elements..
        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }
        
        int newArr[] = new int[size + 1];// new array with incremental size..

        System.out.print("Enter the new value to be insert the element: ");
        int element = sc.nextInt();

        System.out.print("Enter the index value at which to be inserted: ");
        int index = sc.nextInt();

        newArr[index] = element;

        // transfering the elements from 0th index to upto index [ex: newArr[0].....newArr[2]] .
        for(int i = 0;i < index;i++){
            newArr[i] = arr[i];
        }

        // transfering the elemets  from index to upto size.. [Ex: newArr[2].....newArr[size]] . 
        for(int i = index;i < size;i++){
            newArr[i + 1] = arr[i];
        }

        System.out.println("The new Array will be as: ");
        for(int i = 0;i < newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }

        sc.close();

    }
}
