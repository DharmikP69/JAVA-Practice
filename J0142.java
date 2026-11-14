
import java.util.HashMap;

public class J0142 {

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();

    
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                if(map.get(a) != b){
                    return false;
                }
            } else {
                if(map.containsValue(b)){
                    return false;
                }
            }

            map.put(a,b);
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] tests = {
            {"egg", "add"},
            {"foo", "bar"},
            {"badc", "baba"},
            {"paper", "title"},
            {"a", "a"},
            {"ab", "aa"},
            {"abc", "ab"},
            {"", ""}
        };
        boolean[] expected = {true, false, false, true, true, false, false, true};

        for (int i = 0; i < tests.length; i++) {
            boolean result = isIsomorphic(tests[i][0], tests[i][1]);
            System.out.println("\"" + tests[i][0] + "\", \"" + tests[i][1] + "\" -> " + result
                    + (result == expected[i] ? "  PASS" : "  FAIL (expected " + expected[i] + ")"));
        }
    }
}
//Output :
// "egg", "add" -> true  PASS
// "foo", "bar" -> true  FAIL (expected false)
// "badc", "baba" -> true  FAIL (expected false)
// "paper", "title" -> true  PASS
// "a", "a" -> true  PASS
// "ab", "aa" -> true  FAIL (expected false)
// "abc", "ab" -> true  FAIL (expected false)
// "", "" -> true  PASS