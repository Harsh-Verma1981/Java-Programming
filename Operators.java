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
        // int []nums = {2, 2, 1};

        // int res = 0;
        // for(int i = 0;i < nums.length;i++){
        //     // res = arr[i];
        //     res ^= nums[i]; 
        // }

        // Even odd checker using bitwise and 
        int num = 4;

        if((num & 1) == 1){
            System.out.println("Odd");
        }
        else System.out.println("Even");

        // return res;
        // System.out.println("Unique number: " + res);
        /* 
        1. & operator truth table
        bit A | bit B | A & B
        ------|-------|------
        0   |   0   |   0
        0   |   1   |   0
        1   |   0   |   0
        1   |   1   |   1     (only case that gives 1)

        5 = 0101
        3 = 0011
        ------------
            0001  = 1

        2. | operator truth table
        bit A | bit B | A | B
        ------|-------|------
        0   |   0   |   0
        0   |   1   |   1
        1   |   0   |   1
        1   |   1   |   1

        5 = 0101
        3 = 0011
        ------------
            0111  = 7

        
        */
        // swapping using XOR 
        int num1 = 10;
        int num2 = 20;

        a = a ^ b;// a = 10 ^ 20

        b = a ^ b;// b = (10 ^ 20) ^ 20 // 20 ^ 20 = 0 // 10 ^ 0 = 10
        // b = 10
        a = a ^ b;// a = (10 ^ 20) ^ 10 // 10 ^ 10 = 0 // 20 ^ 0 = 20
        // a = 20
        
        int []nums = {1, 2, 3};
        int first = 1;
        int []encoded = new int[nums.length + 1];

        encoded[0] = first;
        for(int i = 1;i < encoded.length;i++){
            encoded[i] = encoded[i - 1] ^ nums[i - 1];
        }

        for(int h : encoded){
            System.out.print(h + " ");
        }
        
    }
}
