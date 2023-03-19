package March_4;

import java.util.LinkedList;
import java.util.Queue;

public class OwnProgram {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        public Node() {
        }
    }
    public static void print(Node root) {
        Queue<Node> levelOrder = new LinkedList<>();
        levelOrder.add(root);

        while(levelOrder.isEmpty() == false ){
            Node current = levelOrder.poll();
            System.out.print(current.val);
            if(current.left != null) {
                levelOrder.add(current.left);
            }
            if(current.right != null) {
                levelOrder.add(current.right);
            }
        }
    }
    public static void insert(Node root,int value) {

        if(root.left == null && root.right == null) {
            root.left = new Node(value);
        }
        if(root.left == null) {
            root.left = new Node(value);
        }
        if(root.right == null) {
            root.right = new Node(value);
        }

        insert(root.left,value);
        insert(root.right,value);
    }
    public static Node callInsert(Node root, int value)  {
        if(root == null) {
            return new Node(value);
        } else {
            return insert(root,value);
        }
        return null;
    }

    public static void delete(Node root, int val) {
        if(root.val == val) {

        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node();
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);
        Node c = callInsert(b,5);

        print(insert(b,5));

    }
}
