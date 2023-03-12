package March_6;

public class QPerfectBinaryTree {
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
    public static int depthFind(Node root) {
        if(root == null) {
            return 0;
        }

        int leftMax = depthFind(root.left);
        int rightMax = depthFind(root.right);

        return Math.max(leftMax,rightMax) +1;
    }
    public static boolean perfectTree(Node root, int depth, int level) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return (depth == level+1);

        if (root.left == null || root.right == null)
            return false;

        return perfectTree(root.left, depth, level+1) && perfectTree(root.right, depth, level+1);
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
//        a.left.right = new Node(5);

        int depth = depthFind(a);
        System.out.println(perfectTree(a, depth, 0));


    }
}
