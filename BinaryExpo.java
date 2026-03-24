import java.util.Scanner;

public class BinaryExpo{
  // to find the pow of a to the power b
    public static double BinaryExponential(double a, int b){
      if(b < 0){ //  base case for negative powers .. 
          b = -b;
          a = 1 / a;
      }
      double ans = 1;
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
      double result = BinaryExponential(2.00, -2);
      System.out.printf("%.5f" ,result);// op is 0.25000
      
    }
}