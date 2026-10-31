import java.util.Arrays;

public class J106 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[pos] = leftSquare;
                left++;
            } else {
                ans[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] tests = {
                { -4, -1, 0, 3, 10 },
                { -7, -3, 2, 3, 11 },
                { 1, 2, 3 },
                { -3, -2, -1 },
                { 5 },
                { 0 },
                { -2, -2, -2 },
                { -6, -4, 1, 2 },
                { -10000, -9999, 0, 9999, 10000 }
        };

        int[][] expected = {
                { 0, 1, 9, 16, 100 },
                { 4, 9, 9, 49, 121 },
                { 1, 4, 9 },
                { 1, 4, 9 },
                { 25 },
                { 0 },
                { 4, 4, 4 },
                { 1, 4, 16, 36 },
                { 0, 99980001, 99980001, 100000000, 100000000 }
        };

        for (int t = 0; t < tests.length; t++) {
            int[] result = sortedSquares(tests[t]);
            System.out.println("Test " + (t + 1) + ": " + Arrays.toString(result)
                    + (Arrays.equals(result, expected[t]) ? "  PASS" : "  FAIL"));
        }
    }
}
//Output :
// Test 1: [0, 1, 9, 16, 100]  PASS
// Test 2: [4, 9, 9, 49, 121]  PASS
// Test 3: [1, 4, 9]  PASS
// Test 4: [1, 4, 9]  PASS
// Test 5: [25]  PASS
// Test 6: [0]  PASS
// Test 7: [4, 4, 4]  PASS
// Test 8: [1, 4, 16, 36]  PASS
// Test 9: [0, 99980001, 99980001, 100000000, 100000000]  PASS