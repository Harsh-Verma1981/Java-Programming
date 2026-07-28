import java.util.Scanner;

public class AutoDeskQues{
    public static String DigitSum(String num1, String num2){
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while(i >= 0 || j >= 0){
            /*
            getting char by 0 is because the ascii value 
            of that current char - 0 will give us the same char value in int format
            Example: 3 - 0 => Ascii(3) = 51 - 48(Ascii for 0)
            */
           
            // no assign on basis of ASCII value
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >=0 ) ? num2.charAt(j) - '0' : 0;

            sb.insert(0, (d1 + d2));

            i--;
            j--;
        }

        return sb.toString();
    }

    public static int Count(int arr[], int k){
        int count = 0;
        int start = 0;
        int end = k - 1;

        while(end < arr.length){
            int mid = start + (end - start) / 2;
            if(arr[mid] % (arr[start] + arr[end]) == 0) count++;

            start++;
            end++;
        }
        
        return count;

    }

    public static int FindElement(int []arr, int n){

        // Brute Force approach ..
        // int res = -1;
        // int n = arr.length;

        // for (int i = 1; i < n - 1; i++) {   // no need to check i=0 or i=n-1
        //     int num = arr[i];
        //     boolean isLess = true;

        //     // check all elements to the left are <= num
        //     for (int j = i - 1; j >= 0; j--) {
        //         if (num < arr[j]) { isLess = false; break; }
        //     }

        //     if (isLess) {
        //         // check all elements to the right are >= num
        //         for (int j = i + 1; j < n; j++) {
        //             if (num > arr[j]) { isLess = false; break; }
        //         }
        //         if (isLess) res = num;
        //     }
        // }
        // return res;

        // optimal approach Prefix sum T.C. - O(n) ..
        int n = arr.length;
        if (n < 3) return -1;

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i]);
        }

        int res = -1;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= leftMax[i - 1] && arr[i] <= rightMin[i + 1]) {
                res = arr[i];
            }
        }

        return res;

    }

    public static void main(String[] args){
        String num1 = "99";
        String num2 = "99";

        String result = DigitSum(num1, num2);
        System.out.println(result);

        int []arr = {1,4,1,6,2};

        int count = Count(arr, 3);
        System.out.println(count);
    }
}