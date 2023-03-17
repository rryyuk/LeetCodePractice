package March_17;

import March_4.QLevelOrder;

import java.util.LinkedList;
import java.util.Queue;

public class QGetLevelOfNodeBinaryTree {
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
    public static void main(String[] argrs) {
        Node tree = new Node();
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        Queue<Node> levelOrder = new LinkedList<>();
        levelOrder.add(a);

        int counter = 1;
        while(levelOrder.isEmpty() == false ) {

            int currentRun = levelOrder.size();

            for (int i = 0; i < currentRun; i++) {
                Node current = levelOrder.poll();
                if (current.val == 1) {
                    System.out.print("found" + counter);
                }
                if (current.left != null) {
                    levelOrder.add(current.left);
                }
                if (current.right != null) {
                    levelOrder.add(current.right);
                }
            }
            counter++;
        }

    }

}

