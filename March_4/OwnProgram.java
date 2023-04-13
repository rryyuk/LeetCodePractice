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
    public static void insert(Node root,int value, int target, boolean isInserted) {

        if (root == null) {
            return;
        }

        if(root.val == target) {
            if(root.left == null){
                root.left = new Node(value);
            } else if (root.right == null){
                root.right = new Node(value);
            } else {
                System.out.println("No empty space");
            }
            isInserted = true;
        }

        insert(root.left,value, target, isInserted);
        if(!isInserted){
            insert(root.right,value, target,isInserted);
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.right.left = new Node(4);
        a.right.right = new Node(5);

        insert(a,10,2,false);
        print(a);


    }
}
