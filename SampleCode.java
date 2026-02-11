import java.util.Scanner;
import java.util.Arrays;

public class SampleCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        for(int i = 0;i < test;i++){
            int arr[] = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            
            for(int j = 0;j < 5;j++){
                Arrays.sort(arr);
                arr[0]++;
            }

            System.out.println(arr[0] * arr[1] * arr[2]);
        }

        sc.close();
    }
}
