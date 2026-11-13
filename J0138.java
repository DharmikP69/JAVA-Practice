public class J0138 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : s.toCharArray()) {
            freq1[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq2[ch - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            if(freq1[index] != freq2[index]){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String[][] tests = {
            {"listen",  "silent",  "true"},
            {"rat",     "car",     "false"},
            {"a",       "a",       "true"},
            {"a",       "b",       "false"},
            {"ab",      "a",       "false"},
            {"aab",     "abb",     "false"},
            {"aacc",    "ccac",    "false"},
            {"anagram", "nagaram", "true"}
        };

        for (int i = 0; i < tests.length; i++) {
            boolean expected = Boolean.parseBoolean(tests[i][2]);
            boolean actual = isAnagram(tests[i][0], tests[i][1]);
            System.out.println("Test " + (i + 1) + ": " + tests[i][0] + ", " + tests[i][1]
                    + " -> " + actual + (actual == expected ? "  PASS" : "  FAIL (expected " + expected + ")"));
        }
    }
}
//Output :
// Test 1: listen, silent -> true  PASS
// Test 2: rat, car -> false  PASS
// Test 3: a, a -> true  PASS
// Test 4: a, b -> false  PASS
// Test 5: ab, a -> false  PASS
// Test 6: aab, abb -> false  PASS
// Test 7: aacc, ccac -> false  PASS
// Test 8: anagram, nagaram -> true  PASS