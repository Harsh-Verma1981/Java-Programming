import java.util.HashSet;// importing the hashset to implement it ..
import java.util.Scanner;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        // Introduction to Hashset D.S in java 
        // Hashset does not allow duplicate data to be stored in it.

        /* It is widely use beacuse
           it add in the hashset in T.C of O(1)
           it search the data in the Hashset in O(1) T.C.
           it removes the data in Hashset in T.C of O(1) 
           that's how it is more efficient than any data structures 
         */

        // defining and declaring the hashset ..
        HashSet<Integer> set = new HashSet<>();

        // Insertion in Hashset
        set.add(1); // similar to add element like ArrayList..
        set.add(2);
        set.add(3);
        set.add(1);// don't include as 1 is already exists..

        // Searching in HashSet
        if(set.contains(1)){
            System.out.println("Set contains 1.");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }

        // Deletion in HashSet
        // set.remove(1);
        if(!set.contains(1)){
            System.out.println("Removal successful");
        }

        // size of HashSet
        int size = set.size();
        System.out.println("The size of the HashSet is " + size);

        // printing all elements 
        System.out.println(set);

        // Iterator in HashSet

        // To iterate the HashSet 
        // we need to import the iterator to traverse the elements in the HashSet

        Iterator i = set.iterator();
        // iterator first will point towards null 
        // it does not iterate it to the first element of the HashSet

        // this iterator has two special func's..
        // hasNext() returns true and false. use to check that there is the next element to traverse or not if false we reached at the last element of our Set
        // next(); use to point or iterate to next element in the HashSet
        
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        
        /*
        Note: It makes no guarantees as to the iteration order of the set 
        */
    }
}
