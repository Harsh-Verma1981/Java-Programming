/* Use of Scanner class methords */

import java.util.*;

// public class LineReader {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int count = 0;
//         // System.out.println("Enter multiple lines (type 'stop' to end):");

//         while (scanner.hasNextLine() && count < 3) {
//             String line = scanner.nextLine();
//             if (line.equalsIgnoreCase("stop")) {
//                 break;
//             }

//             System.out.println(line);
//             count++;
//         }

//         scanner.close();
//     }
// }

public class LineReader{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int count = 1;

        // while(sc.hasNext() && count <= 3){
        //     String getStr = sc.nextLine();
        //     System.out.println(count + " " + getStr);
        //     count++;
        // }

        // double distance1 = Math.sqrt(1 * 1 + 6 * 6);
        // double distance2 = Math.sqrt(1 * 1 + 8 * 8);
        // System.out.println(distance1);
        // System.out.println(distance2);
        
        /* To calculate the no of digits of a number.. */
        int no = sc.nextInt();
        int count = 0;
        int digit;
        int sum = 0;// to get the sum of the digits..

        while(no != 0){
            digit = no % 10;// get the remainder value..
            count++;
            sum += digit;// store the remainder value in sum..
            
            no = no/10;
        }
        System.out.print(count);
        
        

        sc.close();
    }
}