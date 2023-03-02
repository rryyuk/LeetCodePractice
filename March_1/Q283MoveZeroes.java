package March_1;

public class Q283MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int pointerOne = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0){
                break;
            }
            pointerOne++;
        }
        int pointerTwo = pointerOne +1;

        while(pointerOne < nums.length && pointerTwo< nums.length) {
            if(nums[pointerTwo] != 0) {

                int temp = nums[pointerOne];
                nums[pointerOne] = nums[pointerTwo];
                nums[pointerTwo] = temp;
                pointerOne++;
            }
            pointerTwo++;
        }
        for(int i = 0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args){
        int[] num = {0,1,0,2,4,0};
        moveZeroes(num);

    }

}
