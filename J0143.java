import java.util.*;

public class J0143 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }

                map.put(ch, word);
                usedWords.add(word);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] tests = {
                { "abba", "dog cat cat dog" }, // true
                { "abba", "dog cat cat fish" }, // false
                { "aaaa", "dog cat cat dog" }, // false
                { "abba", "dog dog dog dog" }, // false
                { "abc", "dog cat" }, // false (length)
                { "a", "dog" }, // true
                { "ab", "dog dog" } // false
        };
        
        for (String[] test : tests) {
            boolean result = wordPattern(test[0], test[1]);
            System.out.println("\"" + test[0] + "\", \"" + test[1] + "\" -> " + result);
        }
    }
}
// Output :
// "abba", "dog cat cat dog" -> true
// "abba", "dog cat cat fish" -> false
// "aaaa", "dog cat cat dog" -> false
// "abba", "dog dog dog dog" -> false
// "abc", "dog cat" -> false
// "a", "dog" -> true
// "ab", "dog dog" -> false
// Complexity:
// Time O(n) because we traverse each word once and HashMap/HashSet operations
// take O(1) on average.
// Space O(n) because the map and set can store up to the number of unique
// words/pattern characters, which can grow with the input.