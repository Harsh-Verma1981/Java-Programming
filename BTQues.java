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
        
        int leftT = MaxDepth(root.left);
        if(leftT == -1) return -1;

        int rightT =  MaxDepth(root.right);
        if(rightT == -1) return -1;

        if(Math.abs(rightT - leftT) > 1) return -1;

        return 1 + Math.max(leftT, rightT);
    }

    // A balance BT is a tree in which the depth of the two subtrees of every node never differs by more than one.
    public static boolean isBalancedTree(Node root){
        // Key point: left -right > 1 for balanced BT
        return MaxDepth(root) != -1; 
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

        System.out.println(isBalancedTree(root));
    }
}
