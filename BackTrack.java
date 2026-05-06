import java.util.Scanner;

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
    }    
}
