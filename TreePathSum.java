import java.util.*;

class Node{
    Node left; Node right;
    int val;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class TreePathSum{
    public static boolean PathSum(Node root, int sum){
        if(root == null) return false;

        if(root.left == null && root.right == null){
            return sum - root.val == 0;
        }

        sum -= root.val;
        return PathSum(root.left, sum) || PathSum(root.right, sum);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(PathSum(root, 7)); // Output: true (1->2->4)
        System.out.println(PathSum(root, 8)); // Output: true (1->2->5)
        System.out.println(PathSum(root, 15)); // Output: true (1->3->6)
    }
}