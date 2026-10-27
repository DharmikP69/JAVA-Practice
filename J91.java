public class J91 {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] tests = {
                { 1, 7, 3, 6, 5, 6 },
                { 1, 2, 3 },
                { 2, 1, -1 },
                { 1 },
                { 0 },
                { 1, 1 },
                { 0, 0, 0 },
                { -1, -1, 0, 1, 1, 0 },
                { -1, -1, -1, -1, -1, 0 }
        };

        for (int[] t : tests) {
            System.out.println(java.util.Arrays.toString(t) + " -> " + pivotIndex(t));
        }
    }
}
