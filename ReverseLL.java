import java.util.Scanner;
import java.util.LinkedList;

public class ReverseLL {
    public static void Reverse(LinkedList<Integer> head){
        if(head == null) return head;

        if(head.next == null) return head;

        newHead = Reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);



    }
}
