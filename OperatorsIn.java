/* Introduction to operators in java.. */

// // Uniary operators 
import java.util.*;

// public class OperatorsIn {
//     public static void main(String[] argh){
//         // difference between prefix and postfix..

//         int value1 = 10;
//         int value2 = 0;
//         // post increment..
//         value2 = value1++;

//         System.out.println(value1);
//         System.out.println(value2);

//         // pre increment..
//         int value_1 = 10;
//         int value_2 = 0;

//         value_2 = ++value_1;

//         System.out.println(value_1);
//         System.out.println(value_2);
//     }
// }

// // Relational operators..

// public class OperatorsIn {
//     public static void main(String[] argh){
//         int a = 10;
//         int b = 20;
//         // <= operator..
//         if(a <= b){
//             System.out.println(true);// these are true
//         }
//         // >= operator..
//         if(a >= b){
//             System.out.println(false);
//         }
//         // == operator..
//         if(a == b){
//             System.out.println(true);
//         }
//         // != operator..
//         if(a != b){
//             System.out.println(true);// these are true
//         }
//         // < opeartor..
//         if(a < b){
//             System.out.println(true);// these are true
//         }
//         // > operator..
//         if(a > b){
//             System.out.println();
//         }

//     }
// }


// // Logical operators..

// public class OperatorsIn {
//     public static void main(String[] argh){
//         int a = 10;
//         int b = 20;
        
//         // &&(AND operator)
//         if(a % 5 == 0 && b % 5 == 0){
//             System.out.println(a + " and " + " are the factors of 5");
//         }
//         // ||
//         if(a <= b || a % 3 == 0){
//             System.out.println("Either one condition is true");
//         }
//         // (!)Not operator: used to reverse the conitions if true it will turn it into false and vice versa..
//         if(!(a < b)){
//             System.out.println("");
//         }
//     }
// }

// // Bit-wise operators..
/*
    & = binary and [Ex: a=0101; b=0110; therefore the output is 0100]
    | = binary or [Ex: a=0101; b=0110; therefore the output is 0111]
    ^ = binary XOR works with only diff bits combiantion like 01,10 not with 11,00[Ex: a=0101; b=0110; therefore the output is 0011]
    ~ = binary One's complement Convert the bit 0 into 1 and vice versa [Ex: 0101 output will be 1010]
    << = binary left shift
    >> = binary right shift ..
*/

// public class OperatorsIn {
//     public static void main(String[] argh){
        
//         Scanner sc = new Scanner(System.in);

//         String a = sc.nextLine();
//         sc.nextLine();

//         String b = sc.nextLine();
//         sc.nextLine();

//         String c = sc.nextLine();

//         int i = 1;
//         while(sc.hasNext()){
//             System.out.println(sc);
//         }

//         sc.close();
        
//     }
// }

// import java.util.Scanner;

public class OperatorsIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter data (type 'exit' to stop):");

        // while (scanner.hasNext()) {
        //     String input = scanner.next();
            
        //     // Exit the loop if the user types 'exit'
        //     if (input.equalsIgnoreCase("exit")) {
        //         break;
        //     }
        //     System.out.println("You entered: " + input);
        // }

        int value = 700;

        String result = (value < 500) ? "It is cheap" : (value >= 500 && value < 1000) ? "It is little expensive" : "It is very expensive.";
        System.out.println(result);
        
        scanner.close();
    }
}
