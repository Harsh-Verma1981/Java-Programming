import java.util.*;
// import java.util.Scanner;
// import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();// Array list formation 

        // append or add to add the new data in the ArrayList..
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get method is use to get the elements by it's index position..
        int element = list.get(0);
        System.out.println(element);

        // add element by it's index to insert the element to any index value or between arraylist..
        list.add(2, 12);
        System.out.println(list);

        // set element is use to modify the value for existing index..
        list.set(0, 11);// to update the element..
        System.out.println(list);

        // pop || delete element is use to remove the element by it's index value..
        list.remove(1);
        System.out.println(list);

        // to get the size of the arraylist..
        System.out.println(list.size());

        System.out.println("Accessing Element using forEach Loop: ");
        for(int i : list){
            System.out.print(i + " ");
        }System.out.println();

        // sorting of the arraylist using collection package..
        Collections.sort(list);
        
        System.out.println(list);

        sc.close();
    }
}
