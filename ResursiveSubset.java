import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ResursiveSubset {
    public static void subsequence(String s, int index, String current) {

        // BASE CASE: we have processed all characters
        if (index == s.length()) {
            // if(!current.equals("")){
            //     System.out.println(current);// condition 1
            // }

            // if(current.length() == 2){
            //     System.out.println(current); // condition 2
            // }

            if(!current.contains("b")){
                System.out.println(current); // condition 3
            }

            return;
        }

        /* 
            this is going to run in the 2 phases 
        firstly, run the choice 1 upto the base case (appending in the current str that's why we'll be seeing abc ab ac )
        secondly, run the choice 2 upto the base case 
        */

       // CHOICE 2: do not take the character
       subsequence(s, index + 1, current);// decline 
       
       // CHOICE 1: take the character
        subsequence(s, index + 1, current + s.charAt(index));// accept
    }

    public static void subset(int arr[], int idx, ArrayList<Integer> temp){
        if(idx == arr.length){
            System.out.println(temp);
            return;
        }

        // Choice 1: 
        temp.add(arr[idx]);
        subset(arr, idx + 1, temp);// adding

        // backtrack to remove the last added element
        temp.remove(temp.size() - 1);

        // Choice 2: 
        subset(arr, idx + 1, temp);// declining
    }

    // wrong solution ...
    public static void subsequenceWithoutvowelTogether(String s, int index, String current){
        int count = 0;
        String vowel = "aeiouAEIOU";
        if(index == s.length()){
            if(current.compareTo(vowel)){
                count++;
            }

            if(count <= 1){
                System.out.println(current);
            }

            return;
        }

        // choice 1 to accept the chars from left node
        subsequenceWithoutvowelTogether(s, index + 1, current + s.charAt(index));

        // choice 2 to accept the chars from right node
        subsequenceWithoutvowelTogether(s, index + 1, current);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /*

        int n = sc.nextInt();
        
        // Basic Math operation revision 
        double result = (double) n;
        // System.out.println(Math.pow(result, 2));// squre of n 

        int res = (int) Math.pow(result, 2);// for square
        System.out.println(res);

        int sqr = (int) Math.sqrt(result);
        System.out.println(sqr);
        
        */

        String s = "abc";
        String current = "";
        int index = 0;

        // subsequence(s, index, current);

        int arr[] = {1,2,3};
        int idx = 0;
        // subset(arr, idx, new ArrayList<>());

        String sa = "bae";
        subsequenceWithoutvowelTogether(sa, index, current);

        sc.close();
    }
}
