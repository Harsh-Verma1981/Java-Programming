import java.util.*;

public class ResursiveSubset {
    public static void subset(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* Basic Math operation revision */
        double result = (double) n;
        // System.out.println(Math.pow(result, 2));// squre of n 

        int res = (int) Math.pow(result, 2);// for square
        System.out.println(res);

        int sqr = (int) Math.sqrt(result);
        System.out.println(sqr);
        
        sc.close();
    }
}
