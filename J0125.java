import java.util.*;

public class J0125 {
     public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] countP = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {
            
            window[s.charAt(i) - 'a']++;

            if (i >= windowSize) {
                window[s.charAt(i - windowSize) - 'a']--;
            }

            if (i >= windowSize - 1 && Arrays.equals(countP, window)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
       
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(findAnagrams("abab", "ab"));
        System.out.println(findAnagrams("ab", "abab"));
    }
}
//Output :
// [0, 6]
// [0, 1, 2]
// []