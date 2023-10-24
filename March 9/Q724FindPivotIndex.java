class Solution {
    public int pivotIndex(int[] nums) {
        int totalSumOfArray = 0;
        for(int i = 0; i< nums.length; i++) {
            totalSumOfArray = totalSumOfArray + nums[i];
        }

        int leftElementSum = 0;

        for(int i = 0; i< nums.length; i++ ) {
            if( i!= 0) {
                leftElementSum = leftElementSum + nums[i-1];
            }
            if(totalSumOfArray - leftElementSum - nums[i] == leftElementSum ) {
                return i;
            }
        }      
        return -1;
    }
}
