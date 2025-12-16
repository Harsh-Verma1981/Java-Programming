// Leetcode buy and sell stock problem..
// array = {7,1,3,4,6,5};

import java.util.*;

// public class QuestionArray {

//     public static int Profit_Stock(int prices[]){
//         int max_profit = 0;
//         int purchase_price = prices[0];

//         for(int i = 0;i < prices.length;i++){
//             purchase_price = Math.min(purchase_price, prices[i]);

//             int current_price = prices[i] - purchase_price;

//             max_profit = Math.max(max_profit, current_price);
//         }
//         return max_profit;
//     }

//     public static void main(String[] argh){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size: ");
//         int n = sc.nextInt();
        
//         int []prices = new int[n];

//         for(int i = 0;i < n;i++){
//             prices[i] = sc.nextInt();
//         }

//         int profitMargin = Profit_Stock(prices);
//         System.out.println("Profit: " + profitMargin);

//         sc.close();
//     }
// }

// // Merging of Two arrays using 3rd array using class..

// class MergeArray{
//     public int mergeArr[];// declartaion of an array
    
//     // Parameterised constructor..
//     MergeArray(int arr1[], int arr2[]){

//         int x = arr1.length;
//         int y = arr2.length;

//         mergeArr = new int[x + y];// defining of an array..

//         for(int i = 0;i < x;i++){
//             mergeArr[i] = arr1[i];// copying arr1 elements into mergeArr 
//         }

//         for(int j = 0;j < y;j++){
//             mergeArr[x + j] = arr2[j];// copying arr2 elements after the size of arr1 index in merge array..
//         }
//     }

//     public void GetMerge(){
//         System.out.println("The Merged Array will be: ");
//         for(int i = 0;i < mergeArr.length;i++){
//             System.out.print(mergeArr[i] + " ");
//         }

//     }

// }

// public class QuestionArray {
//     public static void main(String[] argh){
//         Scanner sc = new Scanner(System.in);

//         int n = 4; int m = 5;

//         int[] firstArr = new int[n];
//         int[] SecArr = new int[m];
        
//         for(int i = 0;i < n;i++){
//             firstArr[i] = sc.nextInt();
//         }

//         for(int i = 0;i < m;i++){
//             SecArr[i] = sc.nextInt();
//         }

//         MergeArray merge = new MergeArray(firstArr, SecArr);
//         merge.GetMerge();

//         sc.close();
//     }
// }


// // source code to find a prime number and other popular approaches..
// public class QuestionArray {
//     public static void IsPrime(int prime){

//         int count = 0;

//         for(int i = 1;i <= prime;i++){
//             if(prime % i == 0){
//                 count++;
//             }

//         }
//         if(count == 2){
//             System.out.println(prime + " is a prime number.");
//         }
//         else{
//             System.out.println(prime + " is not a prime number.");
//         }
//     }

//     public static void Fibonacci_No(int range){

//         int first = 0;
//         int sec = 1;

//         for(int i = 0;i <= range;i++){

//             // if(i <= range){
//             //     System.out.print(" ");
//             // }

//             System.out.print(first + " ");

//             int third = first + sec;
//             first = sec;
//             sec = third;

//         }
//         System.out.println();
//     }

//     public static void getPrimeInRange(int min_r, int max_r) {
        
//         int i;
//         int j;

//         for(i = min_r;i <= max_r;i++){
//             for(j = 2;j <= i;j++){
//                 if(i % j == 0){
//                     break;
//                 }
//             }
//             if(i == j){
//                 System.out.print(j + " ");
//             }
//         }

//     }

    

//     public static void main(String[] argh){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number to check it is prime or not: ");
//         int num = sc.nextInt();

//         IsPrime(num);

//         System.out.print("Enter the range to get the fibonacci numbers in the range: ");
//         int Rangeoffibo = sc.nextInt();

//         Fibonacci_No(Rangeoffibo);

//         int minRange = 1;
//         int maxRange = 100;

//         getPrimeInRange(minRange, maxRange);

//         sc.close();
//     }
// }

// to reverse the array using loop by using pointers front and end in the array..
// public class QuestionArray {
//     public static void main(String[] args){
//         // source code to reverse the array..

//         int []reverse = {1, 2, 3, 4, 5};

//         int s = 0;
//         int e = reverse.length - 1;

//         while(s <= e){
//             int temp = reverse[s];
//             reverse[s]=reverse[e];
//             reverse[e]=temp;
//             s++;
//             e--; 
//         }

//         for(int i=0;i<reverse.length;i++){
//             System.out.print(reverse[i]);

//             if(i < reverse.length - 1){
//                 System.out.print(", ");
//             }
//         }

//     }
// }

// public class QuestionArray {
//     public static void main(String[] argh) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the size of the Array: ");
//         int size = sc.nextInt();

//         int[] duplicate = new int[size];

//         // Input the array elements
//         for (int i = 0; i < size; i++) {
//             duplicate[i] = sc.nextInt();
//         }
        
//         for (int i = 0; i < duplicate.length; i++) {
//             boolean isDuplicate = false;// to check if the element value is visted already or not..
//             for (int k = 0; k < i; k++) {
//                 if (duplicate[k] == duplicate[i]) {
//                     isDuplicate = true;
//                     break; // No need to keep checking, we found a match
//                 }
//             }

//             // If this is the first occurrence of the element
//             if (!isDuplicate) {
//                 int count = 0;
//                 // Count how many times this element appears in the entire array
//                 for (int j = 0; j < duplicate.length; j++) {
//                     if (duplicate[i] == duplicate[j]) {
//                         count++;
//                     }
//                 }
//                 // Print the element and its total count
//                 System.out.println(duplicate[i] + " = " + count);
//             }
//         }

//         sc.close();
//     }
// }

// Leetcode problem: 
public class QuestionArray {
    public static int duplicates(int arr[]){
        // let array values be {1,2,2,2,1,4,5,1};
        // Output {1,2,4,5};
        int j = 1;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] != arr[i - 1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0;i < size;i++){
            arr[i] = sc.nextInt();
        }

        int AfterRemovalDuplicate = duplicates(arr);

        
        System.out.println("The Unique values: " + AfterRemovalDuplicate);// to get the unique elements .. 

        int unique[] = new int[AfterRemovalDuplicate];// depends on the output..

        for(int i = 0;i < unique.length;i++){
            // System.out.print(arr[i] + " ");
            unique[i] = arr[i];// copying the unique elements values from the array ..
        }

        for(int j : unique){
            System.out.print(unique[j] + ", ");
        }

        sc.close();
    }
}