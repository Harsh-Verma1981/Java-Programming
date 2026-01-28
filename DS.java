import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
// import java.util.Map;
import java.util.Queue;
import java.util.HashMap;
// import 

public class DS {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.pop(); st.isEmpty();

        System.out.println(st.peek());
        
        Queue<Integer> q = new LinkedList<>();

        q.add(110);
        q.add(12);
        q.add(21);

        System.out.println("Peek or Front Element: " + q.peek());

        q.remove();// throws exception if q is empty
        // q.remove();

        System.out.println("New Front Element: " + q.peek());

        if(q.peek().equals(21)) System.out.println("Equals");
        else System.out.println("Not Equals");

        System.out.println(q.poll());// same as pop returns null if empty
        // q.remove();
        // System.out.println(q.poll());

        // System.out.println(q.peek());

        System.out.println(q.element());// retrieve the front element but if q is empty return the exception error
        
        if(q.contains(12)) System.out.println("Yes");
        else System.out.println("No");

        System.out.println("Welcome to HashMap");

        HashMap<Integer, Integer> hmap = new HashMap<>();

        int arr[] = {1,1,1,1,2,2,2,3,3,4,5,7,6,6,6,7,8,4};
        
        for(int i : arr){
            if(hmap.containsKey(i)){
                hmap.put(i, hmap.get(i) + 1);
            }
            else{
                hmap.put(i, 1);
            }
        }

        System.out.println(hmap);
        int sum = 0;

        // adding the key whose values are odd
        for(int key : hmap.keySet()){
            if(hmap.get(key) % 2 == 1){
                sum += key;
            }
        }

        System.out.println(sum);// 21

        
        sc.close();
    }
}
