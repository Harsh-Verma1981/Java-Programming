import java.util.*;

class Node{
    Node left; Node right;
    int val;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class LeafSimilarTree {
    public static boolean leafSimilar(Node root1, Node root2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        collector(root1, list1);
        collector(root2, list2);

        return list1.equals(list2);
    }

    public static void collector(Node root, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        collector(root.left, list);
        collector(root.right, list);
    }
    public static void main(String[] argh){
        Node root1 = new Node(3);
        root1.left = new Node(5);
        root1.right = new Node(1);
        root1.left.left = new Node(6);
        root1.left.right = new Node(2);
        root1.left.right.left = new Node(7);
        root1.left.right.right = new Node(4);
        root1.right.left = new Node(9);
        root1.right.right = new Node(8);

        Node root2 = new Node(3);
        root2.left = new Node(5);
        root2.right = new Node(1);
        root2.left.left = new Node(6);
        root2.left.right = new Node(7);
        root2.right.left = new Node(4);
        root2.right.right = new Node(2);
        root2.right.right.left = new Node(9);
        root2.right.right.right = new Node(8);

        System.out.println(leafSimilar(root1, root2)); // True
    }
}
