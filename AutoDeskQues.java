import java.util.Scanner;

public class AutoDeskQues{
    public static String DigitSum(String num1, String num2){
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while(i >= 0 || j >= 0){
            /*
            getting char by 0 is because the ascii value 
            of that current char - 0 will give us the same char value in int format
            Example: 3 - 0 => Ascii(3) = 51 - 48(Ascii for 0)
            */
           
            // no assign on basis of ASCII value
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >=0 ) ? num2.charAt(j) - '0' : 0;

            sb.insert(0, (d1 + d2));

            i--;
            j--;
        }

        return sb.toString();
    }
    public static void main(String[] args){
        String num1 = "99";
        String num2 = "99";

        String result = DigitSum(num1, num2);
        System.out.println(result);
    }
}