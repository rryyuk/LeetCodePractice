package March_1;
class Node {
    int data;
    Node left;
    Node right;

    Node(int v) {
        this.data = v;
        this.left = this.right = null;
    }
}

public class Q104MaximumDepthOfBinaryTree {

    // IGNORE
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//  }
    public static int depthFind(Node root) {
        if(root == null) {
            return 0;
        }

        int leftMax = depthFind(root.left);
        int rightMax = depthFind(root.right);

        return Math.max(leftMax,rightMax) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        System.out.println(depthFind(root));
    }
}
