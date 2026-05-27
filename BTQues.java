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
    
    static int longpath = 0;
    public static int height(Node root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        longpath = Math.max(longpath, left + right);

        return 1 + Math.max(left, right);
    }

    public static int diameterOfBT(Node root){
        height(root);

        return longpath;
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

        int diameter = diameterOfBT(root);

        System.out.println(diameter);
    }
}
