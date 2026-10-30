import java.util.Arrays;

public class J100 {

    public static void moveZeroes(int[] nums) {
        int right = 0;
        int left = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
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
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int[] a = { 0 };
        int[] b = { 1, 2, 3 };
        int[] c = { 0, 0, 1 };

        moveZeroes(a);
        System.out.println(Arrays.toString(a));
        moveZeroes(b);
        System.out.println(Arrays.toString(b));
        moveZeroes(c);
        System.out.println(Arrays.toString(c));
    }
}
