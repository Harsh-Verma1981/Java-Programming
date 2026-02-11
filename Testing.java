import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        // code file to understand about modular arithmetic
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1;i <= n;i++){
            fact *= i;
        }

        System.out.println(fact);// print 0 in case of overflow like 50!

        // modular arithmetic 
        // System.out.println(fact % 1000000007);

        /*

        Identities- 
            for addition:
                (a + b) % mod = ( a % mod + b % mod) % mod
            for subtraction:
                (a - b) % mod = (a - b + mod) % mod
            for multiplication
                (a * b) % mod = (a % mod * b % mod) % mod
            for division
                (a / b) % mod = (a % mod * pow(b, mod - 2) % mod) % mod
                            ^
                            |
                        prime no
                        
        */

        // using of modular arithmetic to stop the overflow ..
        long fac = 1;
        long mod = 1000000007;

        for(int i = 1;i <= n;i++){
            fac = (fac * i) % mod; // controlling size..
        }

        System.out.println(fac);

        sc.close();
    }
}
