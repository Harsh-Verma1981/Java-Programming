import java.util.ArrayList;
import java.util.Scanner;

public class StackUsingAL {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()) return -1;

            int top = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return top;
        }

        public static int peek(){
            if(isEmpty()) return -1;

            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Stack s = new Stack(); // manualy implementation
        Stack<Integer> s = new Stack<>();

        s.push(12);
        s.push(1);
        s.push(3);
        s.push(22);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }System.out.println();

        for(int i = 0;i < 3;i++){
            System.out.print("Enter the element: ");
            int data = sc.nextInt();
            s.push(data);
        }

        System.out.println("Peek Element: " + s.peek());

        sc.close();
    }    
}
