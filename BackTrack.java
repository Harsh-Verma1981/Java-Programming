import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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

    public static boolean Palindrome(int i, int j, String str){
        if(i >= j){
            return true;
        }

        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return Palindrome(i + 1, j - 1, str);

        // return true;
    }

    // Multiple recursive call: call attended level by level
    // using fibonacci example
    public static int fibonacci(int n){
        if(n <= 1) return n;

        int last = fibonacci(n - 1); // first complete all of it's recursive call
        int seclast = fibonacci(n - 2);// then come to this func and do same

        return last + seclast; 
    }
    // subsequence 
    public static void subsequence(int index, int[] arr, List<List<Integer>> mainList, List<Integer> list){
        if(index >= arr.length){
            mainList.add(new ArrayList<>(list));
            System.out.println(mainList);
            return;
        }

        list.add(arr[index]);
        // take or pick the particular index into the subsequence
        subsequence(index + 1, arr, mainList, list);
        list.remove(list.size() - 1);

        // not pick or not take condition, this element is not added to subsequence
        subsequence(index + 1, arr, mainList, list);
    }

    // subsequence with sum k
    public static void SubsequenceSumK(int index, int[] arr, List<Integer> list, int sum, int k){
        if(index == arr.length){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }

        list.add(arr[index]);
        sum += arr[index];

        SubsequenceSumK(index + 1, arr, list, sum, k);
        list.remove(list.size() - 1);
        sum -= arr[index];

        SubsequenceSumK(index + 1, arr, list, sum, k);
    }

    public static boolean PrintOneSubsequence(int index, int[] arr, List<Integer> list, int sum, int k){
        if(index == arr.length){
            // condition satisfy
            if(sum == k){
                System.out.println(list);
                return true;
            }
            // condition not satisfy
            return false;
        }

        list.add(arr[index]);
        sum += arr[index];

        if(PrintOneSubsequence(index + 1, arr, list, sum, k) == true) return true;
        list.remove(list.size() - 1);
        sum -= arr[index];

        if(PrintOneSubsequence(index + 1, arr, list, sum, k) == true) return true;

        // for no subsequence
        return false;
    }

    public static int CountSubsequence(int index, int[] arr, int sum, int k){
        if(index == arr.length){
            if(sum == k){
                return 1;
            }

            return 0;
        }

        sum+=arr[index];
        int left = CountSubsequence(index + 1, arr, sum, k);// acc to recursn tree all of this method will execute

        sum-=arr[index];

        int right = CountSubsequence(index + 1, arr, sum, k);// then this will execute

        return left + right;
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

        String str = "MADAM";
        int firstidx = 0;
        int lastindx = str.length() - 1;

        if(Palindrome(firstidx, lastindx, str)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        int []sub = {3,1,2};
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        // subsequence(0, sub, mainList, list);

        int[] subk = {1,2,1};
        int k = 4;
        // SubsequenceSumK(0, subk, list, 0, k);

        // if(!PrintOneSubsequence(0, subk, list, 0, k)) System.out.println("No subsequence with sum equals to k");
        PrintOneSubsequence(0, subk, list, 0, k);

        int count = CountSubsequence(0, subk, 0, k);
        System.out.println(count);
        
    }   
}
