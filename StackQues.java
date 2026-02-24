import java.util.*;

public class StackQues {
    public static void pushAtBottom(int data, Stack<Integer> st){
        // using recursion

        // base case
        if(st.empty()){
            st.push(data);
            return;
        }

        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);

        /*
      P  |3 pop      pushing 3 again       <-| P
      O  |2 pop      pushing 2 again         | U
      P  |1 pop      pushing 1 again         | S
         |->Empty()  4 push then             | H
        */

    }

    public static void reverseStack(Stack<Integer> st){
        if(st.empty()) return;

        int top = st.pop();

        reverseStack(st);
        pushAtBottom(top, st);


    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        // pushAtBottom(4, st);// pushing 4 at bottom 
        // reverseStack(st);

        // while(!st.empty()) {
        //     System.out.print("|" + st.peek() + "|");
        //     st.pop();
        // }

        if(st.peek().equals(3)) System.out.println("YES");
        else System.out.println("NO");

        
    }
}
