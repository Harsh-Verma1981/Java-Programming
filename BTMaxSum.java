import java.util.*;

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
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int max_sum = Integer.MIN_VALUE;
        int curr_lvl = 1; int max_lvl = 1;

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;

            for(int i = 0;i < size;i++){
                Node node = q.poll();
                sum += node.val;

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            if(sum > max_sum){
                max_sum = sum;
                max_lvl = curr_lvl;
            }

            curr_lvl++;
        }

        return max_lvl;
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
