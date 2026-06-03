import java.util.*;
// Level order traversal
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
/* 
    1. int n = q.size()
   → freezes current level count
   → this is what separates levels!

    2. for loop runs n times
    → processes ONLY current level
    → children go into queue for next level

    3. res.add(list) is OUTSIDE for loop
    → so entire level is stored at once
    → not node by node!

    LEVEL ORDER TRAVERSAL DRY RUN
    ==============================

    TREE:
            1
        / \
        2   3
        / \
        4   5

    ==============================
    INITIAL SETUP:
    queue → [1]
    res   → []

    ==============================
    WHILE ITERATION 1 (Level 1):
    ------------------------------
    n = 1          ← freeze count of level 1

    FOR i=0:
        poll 1     → list = [1]
        push 2     → queue = [2]
        push 3     → queue = [2, 3]

    for loop done
    res.add([1])   → res = [[1]]

    ==============================
    WHILE ITERATION 2 (Level 2):
    ------------------------------
    n = 2          ← freeze count of level 2

    FOR i=0:
        poll 2     → list = [2]
        push 4     → queue = [3, 4]
        push 5     → queue = [3, 4, 5]

    FOR i=1:
        poll 3     → list = [2, 3]
        no children → queue = [4, 5]

    for loop done
    res.add([2,3]) → res = [[1], [2, 3]]

    ==============================
    WHILE ITERATION 3 (Level 3):
    ------------------------------
    n = 2          ← freeze count of level 3

    FOR i=0:
        poll 4     → list = [4]
        no children → queue = [5]

    FOR i=1:
        poll 5     → list = [4, 5]
        no children → queue = []

    for loop done
    res.add([4,5]) → res = [[1], [2, 3], [4, 5]]

    ==============================
    queue is empty → while loop stops!

    FINAL OUTPUT:
    [[1], [2, 3], [4, 5]]

    ==============================
    KEY POINTS TO REMEMBER:
    → n = q.size() freezes current level count
    → for loop processes ONLY current level nodes
    → children added inside for loop go to NEXT level
    → res.add(list) is outside for loop
    so entire level stored at once!
*/
