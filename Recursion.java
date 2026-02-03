import java.util.Scanner;

public class Recursion {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int no = sc.nextInt();

        RecursiveCall(no);

        sc.close();
    }

    public static int RecursiveCall(int n){
        if(n < 1){
            return 0;
        }
        System.out.print(n + " ");
        
        return RecursiveCall(n - 1);
    }
}
