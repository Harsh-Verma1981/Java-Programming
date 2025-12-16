/* try, throw, catch */
import java.util.*;

class HarshException extends Exception{
    public HarshException(String str){
        super(str);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        for(int a = 0;a < nums.length;a++){
            nums[a] = sc.nextInt();
        }

        int k = sc.nextInt();

        String str = null;
        try{
            j = 18 / i;
            // System.out.println(j);// arithematic exception
            
            System.out.println(nums[k]);// arrayindex
            
            // System.out.println(str.length());
            if(j == 0){// passing a message.
                // Custom Exception passing making my own Exception
                throw new HarshException("This is safe. You can execute the code.");
            }

        }
        catch(HarshException e){
            System.out.println("This is the made in exception " + e);
        }
        catch(ArithmeticException e){
            j = 18 / 1;
            System.out.println("That's the default o/p in the code " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to access the element out of range.");
        }
        catch(NullPointerException e){
            System.out.println("The value is null ");
        }
        catch(Exception e){
            System.out.println("BY defualt error");
        }
        finally{
            System.out.println("Bye Bye");
        }
        System.out.println(j);
        System.out.println("Executed..");

        sc.close();
    }
}



