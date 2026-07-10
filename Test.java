import java.util.*;

public class Test{
    public static boolean isEqual(String s, String t){
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);

            if(!st1.isEmpty() && ch == '?'){
                st1.pop();
            }
            else {
                st1.push(ch);
            }
        }

        for(int i = 0;i < t.length();i++){
            char ch = t.charAt(i);

            if(!st2.isEmpty() && ch == '?'){
                st2.pop();
            } else{
                st2.push(ch);
            }
        }

        StringBuilder sb1 = new StringBuilder(); StringBuilder sb2 = new StringBuilder();
        while(!st1.isEmpty()){
            sb1.insert(0, st1.pop());
        }

        while(!st2.isEmpty()){
            sb2.insert(0, st2.pop());
        }

        String a = sb1.toString();
        String b = sb2.toString();

        return a.equals(b);
    }

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
        
        // System.out.print("Enter the no of test cases: ");
        // int test = sc.nextInt();

        /* while(test-- > 0){
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
        } */

        String s = sc.nextLine();
        String t = sc.nextLine();

        if(isEqual(s, t)){
            System.out.println("YES");
        } else System.out.println("NO");
        
        sc.close();
    }
}