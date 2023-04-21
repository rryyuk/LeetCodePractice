class Solution {
    public int maxDepth(TreeNode root) {
        return depthFind(root);
    }

    public int depthFind(TreeNode root) {
        if(root == null) {
            return 0; 
        }

        int leftMax = depthFind(root.left);
        int rightMax = depthFind(root.right);
        return Math.max(leftMax,rightMax) +1;
    }
}
