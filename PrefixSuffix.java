import java.util.Scanner;
import java.util.Arrays;

public class PrefixSuffix {
    public static int OddPrimePairs(int []arr, int l , int r){
        // arr = {2, 3, 5, 2, 7, 11} l = 1 r = 6
        int count = 0;
        int left = l - 1;
        int right = r - 1;
        // brute force approach 
        for(int i = left;i <= right;i++){
            for(int j = i + 1;j <= right;j++){
                if((arr[i] + arr[j]) % 2 == 1) count++;
            }
        }

        return count;

    }
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,4,5,5,6,11};
        int n = arr.length;

        int prefix[] = new int[n];
        int suffix[] = new int [n];

        prefix[0] = arr[0];
        // precomputing values
        for(int i = 1;i < prefix.length;i++){
            prefix[i] = arr[i - 1] + arr[i];
        }

        suffix[n - 1] = arr[n - 1];
        for(int i = n - 2;i >= 0;i--){
            suffix[i] = arr[i + 1] + arr[i];
        }

        System.out.println("Prefix Sum: ");
        for(int i = n - 1;i >= 0;i--){
            System.out.print(suffix[i] + " ");
        }

        System.out.println();

        System.out.println("Suffix Sum: ");
        for(int i = 0;i < n;i++){
            System.out.print(prefix[i] + " ");
        }System.out.println();

        int prime[] = {2, 3, 5, 2, 7, 11};

        int noOfQueries = 3;
        for(int i = 0;i < noOfQueries;i++){
            System.out.print("Enter the Left Range: ");
            int l = sc.nextInt();
            System.out.print("Enter the Right Range: ");
            int r = sc.nextInt();

            int result = OddPrimePairs(prime, l, r);
            System.out.println("There are " + result + " Odd Pairs.");
        }

        sc.close();
    }
}
