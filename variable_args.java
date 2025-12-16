/* 
Introduction to varargs
    A functoin which is use when we don't know how much arguments will be passed by calling func or 
        to amke our code reliable and efficient..
*/

public class variable_args {
    public static void getSum(int ... args){
        System.out.println("The Total no of args used are: " + args.length);

        int sum = 0;
        for(int x : args){
            sum += x;
        }
        System.out.println("The following Sum of arguments: " + sum);
    }
    

    public static void main(String[] args) {
        
        System.out.println("Sample Code to understand the working of varargs =>");

        getSum(2, 5);
        System.out.println();
        getSum(1, 3, 5);
        System.out.println();
        getSum(3, 7, 10, 12);
        System.out.println();
        getSum(7, 1, 12, 11, 23, 9, 14, 24);
        System.out.println();

    }
}
