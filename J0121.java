public class J0121 {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, low = 0, high = 0, res = Integer.MAX_VALUE;

        while(high < nums.length){
            sum = sum + nums[high];

            while(sum >= target){
                int len = high - low + 1;
                res = Math.min(res,len);

                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
    public static void main(String[] args) {
        int[] targets = {7, 4, 11, 15};
        int[][] tests = {
            {2, 3, 1, 2, 4, 3},
            {1, 4, 4},
            {1, 1, 1, 1},
            {1, 2, 3, 4, 5}
        };
        int[] expected = {2, 1, 0, 5};

        for (int i = 0; i < tests.length; i++) {
            int result = minSubArrayLen(targets[i], tests[i]);
            System.out.println("Test " + (i + 1) + ": target = " + targets[i]
                    + ", result = " + result
                    + ", expected = " + expected[i]
                    + (result == expected[i] ? " PASS" : " FAIL"));
        }
    
    }
}
//Output : 
// Test 1: target = 7, result = 2, expected = 2 PASS
// Test 2: target = 4, result = 1, expected = 1 PASS
// Test 3: target = 11, result = 0, expected = 0 PASS
// Test 4: target = 15, result = 5, expected = 5 PASS