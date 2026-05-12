import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Quicksort {

    public static int placingPivot(int[] arr, int low, int high){

        int pivot = arr[low];// pivot is element at first pos
        int i = low;
        int j = high;

        while(i < j){

            // finding greater element than pivot
            while(arr[i] <= pivot && i <= (high - 1)) i++;

            // finding smaller element than pivot
            while(arr[j] > pivot && j >= (low + 1)) j--;

            // swapping after upper 2 conditions meet
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // placing pivot at it's correct pos
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void solvingForLittleArr(int[] arr, int low, int high){
        
        if(low < high){
            
            int partitionIdx = placingPivot(arr, low, high);
    
            solvingForLittleArr(arr, low, partitionIdx - 1);
            
            solvingForLittleArr(arr, partitionIdx + 1, high);
        }

    }

    public  static void Quicksort(int []arr){
        solvingForLittleArr(arr, 0, arr.length -1);
    }

    public static void main(String[] args) {
        int []arr = {4,6,2,5,7,9,1,3,8};

        Quicksort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
