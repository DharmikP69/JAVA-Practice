import java.util.Arrays;

public class J81 {
    public static int[] applyOperations(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        for (int i = pos; i < n; i++) {
            nums[i] = 0;
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int[] ans = applyOperations(nums);
        System.out.println(Arrays.toString(ans));
    }
}
