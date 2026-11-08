import java.util.*;

class J0130 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] tests = {
            {1, 3, -1, -3, 5, 3, 6, 7},
            {1},
            {1, -1},
            {9, 11},
            {4, 3, 2, 1},
            {1, 2, 3, 4},
            {7, 2, 4}
        };
        int[] ks = {3, 1, 1, 2, 2, 2, 2};
        int[][] expected = {
            {3, 3, 5, 5, 6, 7},
            {1},
            {1, -1},
            {11},
            {4, 3, 2},
            {2, 3, 4},
            {7, 4}
        };

        for (int i = 0; i < tests.length; i++) {
            int[] result = maxSlidingWindow(tests[i], ks[i]);
            System.out.println(Arrays.toString(tests[i]) + ", k=" + ks[i] + " -> " + Arrays.toString(result)
                    + (Arrays.equals(result, expected[i]) ? "  PASS" : "  FAIL (expected " + Arrays.toString(expected[i]) + ")"));
        }
    }
}
//Output :
// [1, 3, -1, -3, 5, 3, 6, 7], k=3 -> [3, 3, 5, 5, 6, 7]  PASS
// [1], k=1 -> [1]  PASS
// [1, -1], k=1 -> [1, -1]  PASS
// [9, 11], k=2 -> [11]  PASS
// [4, 3, 2, 1], k=2 -> [4, 3, 2]  PASS
// [1, 2, 3, 4], k=2 -> [2, 3, 4]  PASS
// [7, 2, 4], k=2 -> [7, 4]  PASS