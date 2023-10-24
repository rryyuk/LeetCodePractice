class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length - 1;
        
        for(int i = nums.length - 1; i>=0; i--) { 
            if(nums[i] + i >= index) { 
                index = i;
            }
        }
        if(index == 0) {
            return true;
        } else {
            return false;
        } 
        
    }
}
