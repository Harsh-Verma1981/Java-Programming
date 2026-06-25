class Node {
    int val;
    Node left; Node right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class BTMaxSum {
    public static int MaxSumLevel(Node root){
        return 0;
    }
    public static void main(String []args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("The Maximum sum is present at level " + MaxSumLevel(root));
    }
}
