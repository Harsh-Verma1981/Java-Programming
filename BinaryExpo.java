import java.util.Scanner;

public class BinaryExpo{
  // to find the pow of a to the power b
    public static int BinaryExponential(int a, int b){
      int ans = 1;
      while(b > 0){
        if(b % 2 == 1){
              ans = ans * a;
        }
        a = a * a;
        b = b / 2;
      
      }
      
      return ans;
    }
    public static void main(String[] argh){
      int result = BinaryExponential(5, 5);
      System.out.println(result);// op is 3125
      
    }
}
