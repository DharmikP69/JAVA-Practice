import java.util.Arrays;

public class J97 {
    public static void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void main(String[] args) {
        int[][] tests = {
                { 1, 2, 3, 4, 5, 6, 7 },
                { -1, -100, 3, 99 },
                { 1, 2 },
                { 1 },
                { 1, 2, 3 },
                { 1, 2, 3, 4, 5, 6 },
        };
        int[] ks = { 3, 2, 3, 0, 3, 1 };

        for (int i = 0; i < tests.length; i++) {
            int[] original = tests[i].clone();
            rotate(tests[i], ks[i]);
            System.out.println(Arrays.toString(original) + ", k = " + ks[i]
                    + " -> " + Arrays.toString(tests[i]));
        }
    }
}
//Output :
// [1, 2, 3, 4, 5, 6, 7], k = 3 -> [5, 6, 7, 1, 2, 3, 4]
// [-1, -100, 3, 99], k = 2 -> [3, 99, -1, -100]
// [1, 2], k = 3 -> [2, 1]
// [1], k = 0 -> [1]
// [1, 2, 3], k = 3 -> [1, 2, 3]
// [1, 2, 3, 4, 5, 6], k = 1 -> [6, 1, 2, 3, 4, 5]
