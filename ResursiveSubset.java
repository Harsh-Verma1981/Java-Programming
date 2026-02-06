import java.util.*;

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

        subsequence(s, index, current);
        
        sc.close();
    }
}
