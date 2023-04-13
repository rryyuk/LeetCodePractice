package March_4;

import java.util.ArrayList;
import java.util.List;

public class QLevelOrderBinaryTreeTraversal {
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
    public static List<Integer> rightView(Node root, List<Integer> order, int level) {
        if(root == null) {
            System.out.println();
        }

        if(order.size()==level) {
            order.add(root.val);
        }
        else{
            order.set(level,root.val);
        }
        rightView(root.right,order,level+1);
        rightView(root.left,order,level+1);
        return order;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        List<Integer> orderList = new ArrayList<>();
    }

}
