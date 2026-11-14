public class J0144 {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String[][] tests = {
                { "abc", "ahbgdc" }, // true
                { "axc", "ahbgdc" }, // false
                { "", "abc" }, // true
                { "a", "" }, // false
                { "aa", "a" }, // false
                { "abc", "abc" }, // true
                { "acb", "ahbgdc" } // false (order matters)
        };

        for (String[] test : tests) {
            boolean result = isSubsequence(test[0], test[1]);
            System.out.println("\"" + test[0] + "\", \"" + test[1] + "\" -> " + result);
        }
    }
}
//Output :
// "abc", "ahbgdc" -> true
// "axc", "ahbgdc" -> false
// "", "abc" -> true
// "a", "" -> false
// "aa", "a" -> false
// "abc", "abc" -> true
// "acb", "ahbgdc" -> false

//Complexity: 
//Time : O(n) we scan t once
//Space : O(1) just two pointers