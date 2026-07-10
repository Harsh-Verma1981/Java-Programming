import java.util.*;

public class Test{
    public static long CountOnes(long []arr, int k, int m){
        long count = 0;
        long sum = 0;

        // 0 to k-1 first window
        for(int i = 0;i < k;i++){
            sum += arr[i];
        }
        if(sum == m) count++;// checking after computing the first window

        // k to n-1
        for(int i = k;i < arr.length;i++){
            sum -= arr[i - k];
            sum += arr[i];

            if(sum == m) count++;
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of test cases: ");
        int test = sc.nextInt();

        while(test-- > 0){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();// size of array
            
            System.out.print("Enter the size of sub arr: ");
            int k = sc.nextInt();// size of sub array

            System.out.print("Enter the no of 1's to find: ");
            int m = sc.nextInt();// no of 1's

            long arr[] = new long[n];

            for(int i = 0;i < n;i++){
                arr[i] = sc.nextLong();
            }

            System.out.print(CountOnes(arr, k, m));
        }
        
        sc.close();
    }
}