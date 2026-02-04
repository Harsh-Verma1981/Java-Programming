import java.util.Scanner;

public class Recursion {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int no = sc.nextInt();

        RecursiveCall(no);
        System.out.println();
        System.out.println(factorial(no));

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