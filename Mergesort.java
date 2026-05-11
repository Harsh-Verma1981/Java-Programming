import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Mergesort {

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;

        List<Integer> list = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }

            else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i = low;i <= high;i++) {
            arr[i] = list.get(i - low);
        }

    }

    public static void dividedArray(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;

        dividedArray(arr, low, mid);// first half till mid
        
        dividedArray(arr, mid + 1, high);// sec half till high

        merge(arr, low, mid, high);
    }

    public static void mergesortarr(int[] arr){
        dividedArray(arr, 0, arr.length - 1);
    }
    public static void main(String[] args){

        int []arr = {3,1,2,4,1,5,2,6,4};
        mergesortarr(arr);

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
