public class J0147 {
    public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            count += expand(s, i, i);

            // Even length
            count += expand(s, i, i + 1);
        }

        return count;
    }
    public static int expand(String s, int left, int right) {
    int count = 0;

    while (left >= 0 &&
           right < s.length() &&
           s.charAt(left) == s.charAt(right)) {

        count++;

        left--;
        right++;
    }

    return count;
}
    public static void main(String[] args) {
        String[] tests = { "abc", "aaa", "a", "abba", "aba", "racecar", "aaaa" };
        int[] expected = { 3, 6, 1, 6, 4, 10, 10 };

        for (int t = 0; t < tests.length; t++) {
            int got = countSubstrings(tests[t]);
            System.out.println(tests[t] + " -> " + got
                    + (got == expected[t] ? " PASS" : " FAIL"));
        }
    }
}
