import java.util.*;

public class CountPrime {
    public static boolean isprime(int n){ // O(sqrt(n))
        // T.C = n * sqrt(n)
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }

        return true;
    }
    public static int countPrimes(int n) {
        // T.C = O(n log log n)
        if (n < 2) return 0;
        // handles edge cases n=0, n=1, n=2 (no primes exist below 2)

        boolean[] isComposite = new boolean[n];
        // size n because we need indices 0 to n-1
        // boolean defaults to false → meaning "assume everyone is prime"
        // we only mark composites, primes stay false

        for (int i = 2; i * i < n; i++) {
            // start from 2 (first prime)
            // stop when i*i >= n (nothing new to cross beyond this point)

            if (!isComposite[i]) {
                // only process i if it's still prime
                // if i is already crossed, its multiples were handled earlier

                for (int j = i * i; j < n; j += i) {
                    // start crossing from i*i (first fresh multiple)
                    // step by i (every multiple of i)
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            // i < n because question asks primes strictly less than n
            if (!isComposite[i]) count++;
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        if(n < 2){
            System.out.println(0);
        }
        else {
            System.out.println(countPrimes(n));
        }
    }

}
