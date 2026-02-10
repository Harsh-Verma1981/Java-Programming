import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();int fact = 1;

        for(int i = 1;i <= n;i++){
            fact *= i;
        }

        System.out.println(fact);
        System.out.println(fact % 1000000007);

        sc.close();
    }
}
