class Solution {
    public boolean isCousins(TreeNode root, int A, int B) {
        if (root == null) return false;
	    Queue<TreeNode> levelQueue = new LinkedList<>();
	    levelQueue.offer(root);
	    while (levelQueue.isEmpty() == false) {
		int size = levelQueue.size();
		boolean checkA = false;		
		boolean checkB = false;		
		for (int i = 0; i < size; i++) {
			TreeNode cur = levelQueue.poll();
            if (cur.val == A) {
                checkA = true;
            }
            if (cur.val == B){
                checkB = true;
            }
			if (cur.left != null && cur.right != null) { 
				if (cur.left.val == A && cur.right.val == B) { 
					return false;
				}
				if (cur.left.val == B && cur.right.val == A) { 
					return false;
				}
			}
			if (cur.left != null) {
				levelQueue.offer(cur.left);
			}
			if (cur.right != null) {
				levelQueue.offer(cur.right);
			}
		}
		if (checkA && checkB)  return true;
	}
	return false;
    }
}
