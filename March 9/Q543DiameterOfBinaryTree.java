class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        } 
        if(root.left == null && root.right == null ) {
            return 0;
        }

        int[] maxDiameter = new int[1];
        diameter(root, maxDiameter);
        return maxDiameter[0];
    }
    public int diameter(TreeNode root, int[] maxDiameter) {
       if(root == null) {
            return 0;
        } 
        int left = diameter(root.left,maxDiameter) ;
        int right = diameter(root.right,maxDiameter) ;
        maxDiameter[0] = Math.max(maxDiameter[0],left+right) ;

        return 1 + Math.max(left, right) ;
    }
}
