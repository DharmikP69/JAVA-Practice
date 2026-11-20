public class J0146 {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) return -1;                    // Step 1

        for (int i = 0; i <= n - m; i++) {       // Step 2
            int j = 0;                           // restart for every i
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;                             // Step 3
            }
            if (j == m) return i;                // Step 4
        }
        return -1;                               // Step 5
    }
    

    public static void main(String[] args) {
        String[][] tests = {
                { "sadbutsad", "sad" },
                { "leetcode", "leeto" },
                { "hello", "ll" },
                { "a", "a" },
                { "abc", "abcd" },
                { "mississippi", "issip" },
                { "aaa", "aaaa" }
        };
        int[] expected = { 0, -1, 2, 0, -1, 4, -1 };

        for (int t = 0; t < tests.length; t++) {
            int got = strStr(tests[t][0], tests[t][1]);
            System.out.println(tests[t][0] + " / " + tests[t][1]
                    + " -> " + got + (got == expected[t] ? " PASS" : " FAIL"));
        }
    }
}
//Output :
// sadbutsad / sad -> 0 PASS
// leetcode / leeto -> -1 PASS
// hello / ll -> 2 PASS
// a / a -> 0 PASS
// abc / abcd -> -1 PASS
// mississippi / issip -> 4 PASS
// aaa / aaaa -> -1 PASS