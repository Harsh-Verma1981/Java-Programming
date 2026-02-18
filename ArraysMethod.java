import java.util.Arrays;
import java.util.List;

public class ArraysMethod {
    public static void main(String[] args) {
        // Introduction to Array Methods in java..

        // // asList method to convert the array into the list..
        String [] greet = {"Hello", "Namaste", "Bonjour"};

        List <String> list= Arrays.asList(greet);

        System.out.print("The Array is converted into List: ");
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println(list.size());

        // // fill method is used to set the default value in the array than 0 

        int marks[] = new int[5];

        Arrays.fill(marks, 120);// setting the default value form 0 to 120..

        for(Integer i : marks){
            System.out.print(i + " ");
        }System.out.println();

        // // copyof method is use to make a copy of an array either for some specifc length or the entire length..
        int arr1[] = {1, 2, 3, 4, 5};

        int [] arr2 = Arrays.copyOf(arr1, 3);// to copy all of the elements from the arr1..

        arr2[2] = 12;

        for(int i : arr1){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int j : arr2){
            System.out.print(j + " ");
        }

        /* equals method is use to compare the elements of both the array */
        String [] array1 = {"Hello", "Java"};
        String [] array2 = {"Hello", "Java"};

        System.out.println("\n" + Arrays.equals(array1, array2));// return true is equal else false

        /* compare method is use to compare the elements aa well as it's no of it's element */
        String [] arre1 = {"Hello", "Java"};
        String [] arre2 = {"Hello", "Java"};

        int c = Arrays.compare(arre1, arre2);
        System.out.println(c);// returns 0 if both of the arrays are equal..

        /* sort method is use to sort the array */
        int []price = {12, 1, 2,5, 2, 11};

        

        Arrays.sort(price);

        for(int i : price){
            System.out.print(i + " ");
        }System.out.println();

        /* BinarySearch method to search the element from the sorted array */
        int arr[] = {1, 2, 3, 4, 5, 6};
        int key = 3;// if key not exist it will return negative value..

        // else if duplicate values are there it can print any index value of that key ..

        System.err.println(Arrays.binarySearch(arr, key));

        int a[] = {1,1,2,2};
        int b[] = {2,2};

        int op = Arrays.compare(a, b);
        if(op == 0){
            System.out.println("Equal");
        }
        
    }
}
