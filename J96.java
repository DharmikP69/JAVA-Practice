import java.util.HashMap;
import java.util.Arrays;

public class J96 {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            count = count + map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    static void test(int[] nums, int k, int expected) {
        int result = subarraySum(nums, k);
       
        System.out.println("nums = " + Arrays.toString(nums)
                + ", k = " + k + " | expected = " + expected + ", got = " + result);
    }

    public static void main(String[] args) {
        test(new int[]{1, 1, 1}, 2, 2);                       // basic
        test(new int[]{1, 2, 3}, 3, 2);                       // LeetCode example 2
        test(new int[]{3, 1}, 4, 1);                          // whole array
        test(new int[]{1}, 1, 1);                             // single element, match
        test(new int[]{1}, 2, 0);                             // single element, no match
        test(new int[]{1, -1, 0}, 0, 3);                      // negatives and zero
        test(new int[]{1, -1, 1, -1}, 0, 4);                  // repeated prefix sums
        test(new int[]{-1, -1, 1}, 0, 1);                     // negatives
        test(new int[]{0, 0, 0}, 0, 6);                       // all zeros
        test(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7, 4);       // mixed, longer
        test(new int[]{}, 0, 0);                              // empty array
    }
}
