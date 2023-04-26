class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        } else if (val == root.val) {
            return root;
        }else if( root.val < val) {
           return searchBST(root.right, val);
        } else if (root.val > val) {
            return searchBST(root.left, val);
        }
        return null;
    }
}
