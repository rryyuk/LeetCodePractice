package March_1;

public class Q136SingleNumber {
    public static int singleNumber(int[] nums) {
        int nonRepeating = 0;
        for(int i=0; i<nums.length; i++){

            nonRepeating ^= nums[i];
        }

        return nonRepeating;
    }
    public static void main(String[] args){
        int[] num = {1,1,2,2,4,3,3};
        System.out.println(singleNumber(num));
    }
}
