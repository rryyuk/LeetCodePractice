package March_1;

public class Q162FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1;

        while(low < high) {
            int mid = low + (high - low)/2;

            if(nums[mid] >= nums[mid+1] ) {
                high = mid;
            } else {
                low = mid+1;
            }
        }

        return high;
    }
    public static void main(String[] args){
        int[] num = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(num));
    }
}
