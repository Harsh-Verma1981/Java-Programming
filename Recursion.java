import java.util.Scanner;

public class Recursion {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the range: ");
        int no = 5;

        // RecursiveCall(no);

        // System.out.println();

        // System.out.println(factorial(no));
        // printN(no);

        // System.out.println();

        // int nos = 12345;
        // System.out.println("Sum of digits by Recursion: " + SumOfDigits(nos));

        System.out.println(PowerOfNumbers(3, 4));// 81

        System.out.println(SumOfNnumbers(no));

        sc.close();
    }

    public static int RecursiveCall(int n){
        if(n < 1){
            return 0;
        }
        System.out.print(n + " ");
        
        return RecursiveCall(n - 1);
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printN(int n){
        if(n == 0){
            return ;
        }
        printN(n - 1);
        System.out.print(n + " ");
    }

    public static int SumOfDigits(int x){
        if(x == 0){
            return 0;
        }

        return (x % 10) + SumOfDigits(x / 10);// sum of all digits
    }

    public static int PowerOfNumbers(int base, int power){
        if(power < 1){
            return 1;
        }

        return base * PowerOfNumbers(base, power - 1);
    }

    public static int SumOfNnumbers(int n){
        if(n <= 1){
            return 1;
        }

        return n + SumOfNnumbers(n - 1);
    }
}
// import java.util.*;

// class Laptop {
//     int price;
//     int quality;

//     Laptop(int price, int quality) {
//         this.price = price;
//         this.quality = quality;
//     }
// }

// public class Recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         Laptop[] arr = new Laptop[n];
        
//         // Input laptops
//         for (int i = 0; i < n; i++) {
//             int price = sc.nextInt();
//             int quality = sc.nextInt();
//             arr[i] = new Laptop(price, quality);
//         }
        
//         // Sort laptops by price
//         Arrays.sort(arr, (a, b) -> a.price - b.price);
        
//         // Check Alex's condition
//         for (int i = 1; i < n; i++) {
//             if (arr[i].quality < arr[i - 1].quality) {
//                 System.out.println("Happy Alex");
//                 return;
//             }
//         }
        
//         System.out.println("Poor Alex");
//     }
// }