import java.util.*;


class J0129 {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    required--;
                }
                map.put(c, map.get(c) - 1);
            }

            while (required == 0) {
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        required++;
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + minLen);
    }
    public static void main(String[] args) {
        String[][] tests = {
            {"ADOBECODEBANC", "ABC"},
            {"a", "a"},
            {"a", "aa"},
            {"aa", "aa"},
            {"ab", "b"},
            {"abc", "cba"}
        };
        String[] expected = {"BANC", "a", "", "aa", "b", "abc"};

        for (int i = 0; i < tests.length; i++) {
            String result = minWindow(tests[i][0], tests[i][1]);
            System.out.println("(" + tests[i][0] + ", " + tests[i][1] + ") -> \"" + result + "\""
                    + (result.equals(expected[i]) ? "  PASS" : "  FAIL (expected \"" + expected[i] + "\")"));
        }
    }
}
//Output : 
// (ADOBECODEBANC, ABC) -> "BANC"  PASS
// (a, a) -> "a"  PASS
// (a, aa) -> ""  PASS
// (aa, aa) -> "aa"  PASS
// (ab, b) -> "b"  PASS
// (abc, cba) -> "abc"  PASS