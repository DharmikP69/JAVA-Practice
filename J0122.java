import java.util.*;

public class J0122 {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int low = 0;
        int res =0;

        for (int high = 0; high < s.length(); high++) {

            while (set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(high));
            res = Math.max(res, high - low + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] tests = {"abcabcbb", "bbbbb", "pwwkew", "", "a", "abba", "dvdf"};
        int[] expected = {3, 1, 3, 0, 1, 2, 3};

        for (int i = 0; i < tests.length; i++) {
            int result = lengthOfLongestSubstring(tests[i]);
            System.out.println("Test " + (i + 1) + ": \"" + tests[i] + "\""
                    + ", result = " + result
                    + ", expected = " + expected[i]
                    + (result == expected[i] ? " PASS" : " FAIL"));
        }
    }
}
//Output:-
// Test 1: "abcabcbb", result = 3, expected = 3 PASS
// Test 2: "bbbbb", result = 1, expected = 1 PASS
// Test 3: "pwwkew", result = 3, expected = 3 PASS
// Test 4: "", result = 0, expected = 0 PASS
// Test 5: "a", result = 1, expected = 1 PASS
// Test 6: "abba", result = 2, expected = 2 PASS
// Test 7: "dvdf", result = 3, expected = 3 PASS