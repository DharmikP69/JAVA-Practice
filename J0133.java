import java.util.Arrays;

public class J0133 {
    public static String longestCommonPrefix(String[] strs) {

        // if (strs == null || strs.length == 0)
        //     return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[][] test = { { "flower", "flow", "flight" }, { "dog", "racecar", "car" }, { "alone" },
                { "ab", "ab", "ab" }, { "", "b" }, {} };

        for (String[] t : test) {
            System.out.println(Arrays.toString(t) + " -> " + longestCommonPrefix(t));
        }
    }
}
//Output :
// PS C:\Users\DHARMIK\OneDrive\Desktop\dsa\JAVA\Java-program> cd "c:\Users\DHARMIK\OneDrive\Desktop\dsa\JAVA\Java-program\" ; if ($?) { javac J0133.java } ; if ($?) { java J0133 }
// [flower, flow, flight] -> fl
// [dog, racecar, car] -> 
// [alone] -> alone
// [ab, ab, ab] -> ab
// [, b] -> 
// [] -> 
// PS C:\Users\DHARMIK\OneDrive\Desktop\dsa\JAVA\Java-program> 