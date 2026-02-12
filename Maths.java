import java.util.Scanner;

public class Maths {
    public static int GCD(int n1, int n2){

        int gcd = 0;

        if(n1 <= 1) return n2;

        if(n2 <= 1) return n1;

        for(int i = 1;i <= Math.min(n1, n2);i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                gcd = i;
            }
        }

        return gcd;
    }

    public static void classicHashing(){

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
    
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int no1 = sc.nextInt();

        System.out.print("Enter the number 2: ");
        int no2 = sc.nextInt();

        int result = GCD(no1, no2);
        System.out.println(result);

        sc.close();
    }
}
