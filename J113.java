import java.util.Arrays;

public class J113 {
    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; // exact match
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[][] nums = {
                { -1, 2, 1, -4 },
                { 0, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 2 },
                { -1, 0, 1, 1, 55 },
                { 4, 0, 5, -5, 3, 3, 0, -4, -5 },
                { -3, -2, -5, 3, -4 },
                { 10, 20, 30, 40 },
                { 1, 2, 3 }
        };

        int[] target = { 1, 1, -100, 100, 3, 3, -2, -1, 82, 6 };

        for (int i = 0; i < nums.length; i++) {
        System.out.println(Arrays.toString(nums[i]) + ", target = " + target[i]
                + " -> " + threeSumClosest(nums[i], target[i]));
    }
    }
}
//Output :
// [-1, 2, 1, -4], target = 1 -> 2
// [0, 0, 0], target = 1 -> 0
// [1, 1, 1, 0], target = -100 -> 2
// [1, 1, 1, 0], target = 100 -> 3
// [0, 1, 2], target = 3 -> 3
// [-1, 0, 1, 1, 55], target = 3 -> 2
// [4, 0, 5, -5, 3, 3, 0, -4, -5], target = -2 -> -2
// [-3, -2, -5, 3, -4], target = -1 -> -2
// [10, 20, 30, 40], target = 82 -> 80
// [1, 2, 3], target = 6 -> 6