import java.util.Scanner;

// Leetcode Question number 26 ..
// public class TwopointersLeetcode {
//     // this func will work if the array is sorted in ascending order ..
//     public static int duplicates(int arr[]){
//         // let array values be {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//         // Output {0,1,2,3,4}; ..
//         int j = 1;
//         for(int i = 1;i < arr.length;i++){
//             if(arr[i] != arr[i - 1]){
//                 arr[j] = arr[i];
//                 j++;
//             }
//         }
//         return j;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of an Array: ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             arr[i] = sc.nextInt();
//         }

//         int AfterRemovalDuplicate = duplicates(arr);

        
//         System.out.println("The Unique values: " + AfterRemovalDuplicate);// to get the unique elements .. 

//         int unique[] = new int[AfterRemovalDuplicate];// depends on the output..

//         for(int i = 0;i < unique.length;i++){
//             // System.out.print(arr[i] + " ");
//             unique[i] = arr[i];// copying the unique elements values from the array ..
//         }

//         for(int j : unique){
//             System.out.print(unique[j] + ", ");
//         }

//         sc.close();
//     }
// }

/* Leetcode Question number-283 
    Moving zeroes */
// public class TwopointersLeetcode {
//     public static void moveZeroes(int[] numbers){
//         // input - 0 1 0 3 0 12
//         // output - 1 3 12 0 0 0 we need to move the zeroes in the last of an array after non zeroes values ..

//         int j = 0;// unique element pointer ..
//         for(int i = 0;i < numbers.length;i++){
//             if(numbers[i] != 0){
//                 int temp = numbers[i];
//                 numbers[i] = numbers[j];
//                 numbers[j] = temp;
//                 j++; // after the swapping move the unique element pointer ..
//             }
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int arr[] = {0, 1, 0, 3, 12};

//         moveZeroes(arr);
//         // for-each) which assigns the value of the element to i, not the index. So when you do arr[i],
//         //  you're trying to access arr[value], not arr[index], 
//         //  which can go out of bounds if the value itself is greater than the array size.
//         for(int i : arr){
//             System.out.print(i + " ");
//         }
//         sc.close();
//     }
// }

/* Leetcode problem no- 27 
    Remove element */
public class TwopointersLeetcode {
    // order of the elements don't matter in this array.
    public static int removeElements(int[] nums, int value){
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != value){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;// no of unique elements ..
    }
    public static void main(String[] args) {

        int arr[] = {0,1,2,2,3,0,4,2};

        int size = removeElements(arr, 2);
        int original[] = new int[size];

        for(int i = 0;i < original.length;i++){
            original[i] = arr[i];
        }

        for(int i : original){
            System.out.print(i + " ");
        }
        
    }
}

/* Leetcode problem- */