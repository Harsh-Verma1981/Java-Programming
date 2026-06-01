import java.util.*;
class Pair{
    Node node;
    int row;

    Pair(Node node, int row){
        this.node = node;
        this.row = row;
    }
}

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

public class BTviews {
    public static List<Integer> TopView(Node root){
        // using Level order traversal
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        if(root == null) return list;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair it = q.poll();
            int row = it.row;
            Node temp = it.node;

            if(map.get(row) == null) map.put(row, temp.val);

            if(temp.left != null) q.offer(new Pair(temp.left, row - 1));

            if(temp.right != null) q.offer(new Pair(temp.right, row + 1));
        }

        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            list.add(mp.getValue());
        }

        return list;
    }

    public static List<Integer> BottomView(Node root){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        if(root == null) return list;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair p = q.poll();

            int line = p.row;
            Node temp = p.node;

            map.put(line, temp.val);// values can update in this on each level

            if(temp.left != null) q.offer(new Pair(temp.left, line - 1));

            if(temp.right != null) q.offer(new Pair(temp.right, line + 1));

        }

        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            list.add(mp.getValue());
        }

        return list;
    }

    public static List<Integer> RightLeftView(Node root, List<Integer> list, int level){
        if(root == null) return list;

        // taking first element for each level as per the view (right/left)
        if(level == list.size()) list.add(root.val);

        RightLeftView(root.right, list, level + 1);// left will be traverse first for left view
        RightLeftView(root.left, list, level + 1);// right will be traverse first for right view 

        return list;
    }

    public static boolean getPath(Node root, List<Integer> list, int value){
        if(root == null) return false;

        list.add(root.val);

        if(root.val == value) return true;

        if(getPath(root.left, list, value) || getPath(root.right, list, value)){
            return true;
        }

        // undo or backtrack
        list.remove(list.size() - 1);

        return false;
    }

    public static Node LowestCommonAncestor(Node root, Node p, Node q){
        if(root == null || root == q || root == p) return root;

        Node left = LowestCommonAncestor(root.left, p, q);
        Node right = LowestCommonAncestor(root.right, p, q);

        if(left == null) return right;

        else if(right == null) return left;
        // if both are not null
        else return root;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        /*
             1
            / \
           2   3
          / \ / \
         4  5|6  7   
         
        // 4 2 1 3 7 :TV
        // 4 2 6 3 7 :BV
        */
        
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // List<Integer> list = new ArrayList<>(TopView(root));
        // List<Integer> list = new ArrayList<>(BottomView(root));
        List<Integer> list = new ArrayList<>();
        
        // RightLeftView(root, list, 0);

        // System.out.println("The Top view: ");
        // System.out.println("The Right View: ");
        // for(int i : list){
        //     System.out.print(i + " ");
        // }

        boolean isExistPath = getPath(root, list, 5);

        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        Node p = root.left.right;
        Node q = root.right.right;

        Node LCA = LowestCommonAncestor(root, p, q);
        System.out.println(LCA.val);

    }
}
