import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
/*      1
      /   \
     2     3
    / \   / \
   4   5 6   7
*/

public class BFS {

    // BFS Traversal
    public static void bfs(Node root) {

        // edge case
        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        // insert root
        q.offer(root);

        while(!q.isEmpty()) {

            // remove front node
            Node current = q.poll();

            // print node
            System.out.print(current.data + " ");

            // add left child
            if(current.left != null) {
                q.offer(current.left);
            }

            // add right child
            if(current.right != null) {
                q.offer(current.right);
            }
        }
    }
    /* 
    create empty Queue
    push root into queue

    while queue is not empty:
        node = queue.poll()    ← remove from front
        visit node

        if node.left exists  → queue.add(node.left)
        if node.right exists → queue.add(node.right)
    */


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bfs(root);
    }
}