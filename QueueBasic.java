import java.util.*;

public class QueueBasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        q.add(110);
        q.add(12);
        q.add(21);

        System.out.println("Peek or Front Element: " + q.peek());

        q.remove();// throws exception if q is empty
        // q.remove();

        System.out.println("New Front Element: " + q.peek());

        if(q.peek().equals(12)) System.out.println("Equals");
        else System.out.println("Not Equals");

        System.out.println(q.poll());// same as pop returns null if empty
        // q.remove();
        // System.out.println(q.poll());

        // System.out.println(q.peek());

        System.out.println(q.element());// retrieve the front element but if q is empty return the exception error
        
        if(q.contains(12)) System.out.println("Yes");
        else System.out.println("No");

        // int size = q.size();
        // System.out.println("Size of the Queue is " + size);

        sc.close();
    }
}