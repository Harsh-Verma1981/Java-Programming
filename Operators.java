public class Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // arithmetic operators
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("b / a = " + (b / a)); // division
        System.out.println("b % a = " + (b % a)); // modulus

        // relational operators
        System.out.println("a == b: " + (a == b)); // equal to
        System.out.println("a != b: " + (a != b)); // not equal to
        System.out.println("a > b: " + (a > b));   // greater than
        System.out.println("a < b: " + (a < b));   // less than
        System.out.println("a >= b: " + (a >= b)); // greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // less than or equal to

        // logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y)); // logical AND
        System.out.println("x || y: " + (x || y)); // logical OR
        System.out.println("!x: " + (!x));         // logical NOT

        // bitwise operators
        System.out.println("a & b: " + (a & b));   // bitwise AND
        System.out.println("a | b: " + (a | b));   // bitwise OR
        System.out.println("a ^ b: " + (a ^ b));   // bitwise XOR
        System.out.println("~a: " + (~a));         // bitwise NOT

        // shift operators
        System.out.println("a << 2: " + (a << 2)); // left shift
        System.out.println("a >> 2: " + (a >> 2)); // right shift
        System.out.println("a >>> 2: " + (a >>> 2)); // unsigned right shift

        // bitwise XOR for unique number
        int []nums = {2, 2, 1};

        int res = 0;
        for(int i = 0;i < nums.length;i++){
            // res = arr[i];
            res ^= nums[i]; 
        }

        // return res;
        System.out.println("Unique number: " + res);
    }
}
