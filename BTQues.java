import java.util.*;

class Node{
    int val;
    Node left, right;

    Node(int val){
        this.val = val;

        left = right = null;
    }
}

public class BTQues {
    public static int MaxDepth(Node root){
        if(root == null) return 0;

        return 1 + Math.max(MaxDepth(root.left), MaxDepth(root.right));
    }
    public static void main(String[] args){
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int heightOfTree = MaxDepth(root);
        System.out.println(heightOfTree);
    }
}
