public class J0123 {
    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (matches(freq1, freq2))
            return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(freq1, freq2))
                return true;
        }

        return false;
    }

    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s1 = { "ab", "ab", "a", "adc", "abc", "hello" };
        String[] s2 = { "eidbaooo", "eidboaoo", "a", "dcda", "ab", "ooolleoooleh" };
        boolean[] expected = { true, false, true, true, false, false };

        for (int i = 0; i < s1.length; i++) {
            boolean result = checkInclusion(s1[i], s2[i]);
            System.out.println("Test " + (i + 1) + ": s1 = " + s1[i]
                    + ", s2 = " + s2[i]
                    + ", result = " + result
                    + ", expected = " + expected[i]
                    + (result == expected[i] ? " PASS" : " FAIL"));
        }
    }
}
//Output :
// Test 1: s1 = ab, s2 = eidbaooo, result = true, expected = true PASS
// Test 2: s1 = ab, s2 = eidboaoo, result = false, expected = false PASS
// Test 3: s1 = a, s2 = a, result = true, expected = true PASS
// Test 4: s1 = adc, s2 = dcda, result = true, expected = true PASS
// Test 5: s1 = abc, s2 = ab, result = false, expected = false PASS
// Test 6: s1 = hello, s2 = ooolleoooleh, result = false, expected = false PASS