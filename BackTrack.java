import java.util.Scanner;

public class BackTrack {
    // basic BackTrack code to understand the BTS scenario ..
    public static void print1toN(int i, int n){
        if(i < 1) return;

        print1toN(i - 1, n);
        System.out.println(i + ". Hello God!");
    }

    public static void printNto1(int i, int n){
        if(i > n) return;

        printNto1(i + 1, n);
        System.out.println(i + ". Thank You God!");
    }

    // Parameterized way to return the sum
    public static void ParaSum(int i, int sum){
        if(i < 1) {
            System.out.println("Sum of N numbers: " + sum);
            return;
        }

        ParaSum(i - 1, sum + i);
    }

    // functional way 
    // here we are breaking problem into sub problems ..
    public static int FuncSum(int n){
        if(n == 0){
            return 0;
        }

        return n + FuncSum(n - 1);
    }

    // Array reverse
    public static void ReverseArr(int low, int high, int []arr){
        if(low >= high){
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }System.out.println();
            return;
        }
        // swapping logic 
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        ReverseArr(low + 1, high - 1, arr);

    }

    public static void SinglePtrReversal(int i, int[] arr){
        int n = arr.length;
        if(i >= (n/2)) {
            for(int j = 0;j < n;j++){
                System.out.print(arr[j] + " ");
            }System.out.println();
            return;
        }

        // swapping logic
        int first = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = first;

        SinglePtrReversal(first + 1, arr);
    }
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();

        print1toN(n, n);
        System.out.println();
        printNto1(1, n);

        int sum = 0;
        ParaSum(n, sum);

        System.out.println("Functional way for sum " + FuncSum(n));
        int []arr = {1,2,3,4,5};
        int i = 0; int j = arr.length - 1;

        // ReverseArr(i, j, arr);
        SinglePtrReversal(i, arr);

    }    
}
