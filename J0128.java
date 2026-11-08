import java.util.*;

public class J0128 {
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);

                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
     public static void main(String[] args) {
        int[][] tests = {
            {1, 2, 1},
            {0, 1, 2, 2},
            {1, 2, 3, 2, 2},
            {3, 3, 3},
            {1},
            {1, 2, 3, 4, 5}
        };
        int[] expected = {3, 3, 4, 3, 1, 2};

        for (int i = 0; i < tests.length; i++) {
            int result = totalFruit(tests[i]);
            System.out.println(Arrays.toString(tests[i]) + " -> " + result
                    + (result == expected[i] ? "  PASS" : "  FAIL (expected " + expected[i] + ")"));
        }
    }
}
//Output :
// [1, 2, 1] -> 3  PASS
// [0, 1, 2, 2] -> 3  PASS
// [1, 2, 3, 2, 2] -> 4  PASS
// [3, 3, 3] -> 3  PASS
// [1] -> 1  PASS
// [1, 2, 3, 4, 5] -> 2  PASS