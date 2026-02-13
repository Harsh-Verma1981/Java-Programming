import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static int BinarySearch(int arr[], int k){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(arr[mid] == k) return mid;

            else if(arr[mid] < k){
                s = mid - 1;
            }
            else{
                e = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        int k = 4;

        // System.out.println((BinarySearch(arr, k)));

        int result = Arrays.binarySearch(arr, k);
        System.out.println(result);
        
        sc.close();
    }
}
