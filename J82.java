import java.util.Arrays;

public class J82 {
    public static void moveZeroes(int[] nums) {
        int right = 0;
        int left = 0;

        while(right < nums.length){
            if(nums[right]!=0){
                int trmp = nums[right];
                nums[right] = nums[left];
                nums[left] = trmp;
                right++;
                left++;
            } else {
                right++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
