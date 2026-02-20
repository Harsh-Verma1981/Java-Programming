import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static int BinarySearchforRotatedArray(int arr[], int k){
        int s = 0;
        int e = arr.length - 1;
        // 6,7,8,9,1,2,3,4,5      k = 7;
        while(s <= e){
            int mid = s + (e - s) / 2;

            if(arr[mid] == k) return mid;

            else if(arr[mid] >= arr[0] && k < arr[0]){
                s = mid + 1;
            }

            else if(arr[mid] < arr[0] && k >= arr[0]){
                e = mid - 1;
            }

            else if(arr[mid] < k){
                s = mid + 1;
            }

            else{
                e = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        int k = 4;

        // System.out.println((BinarySearch(arr, k)));

        // not going to work if elements of array gets rotated from k index .. 
        int result = Arrays.binarySearch(arr, k);
        // System.out.println(result);

        int nums[] = {6,7,8,9,1,2,3,4,5};
        int target = 7;// Thala for a reason

        int index = BinarySearchforRotatedArray(nums, target);
        System.out.println(index);// at index 1 
        
        sc.close();
    }
}
