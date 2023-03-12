package March_4;

import java.util.LinkedList;
import java.util.Queue;

public class QLevelOrder {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node() {
        }
        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        Queue<Node> levelOrder = new LinkedList<>();
        levelOrder.add(a);

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
}
