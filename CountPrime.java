import java.util.*;

public class CountPrime {
    public static boolean isprime(int n){ // O(sqrt(n))
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range ");
        int n = sc.nextInt();

        if(n < 2){
            System.out.print(0);
            return;
        }else {

            int i = 2; int counter = 0;
            // O(n)
            while(i < n){
                if(isprime(i)) counter++;
                i++;
            }
    
            System.out.print(counter); // T.C = n * sqrt(n)
        }
    }
    
}
