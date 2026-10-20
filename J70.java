import java.util.*;

public class J70 {
    public static boolean anagrams(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        int len = s1.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < len; i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0) + 1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0) + 1);
        }

        for (char c : map1.keySet()) {
            if (!map1.get(c).equals(map2.get(c))) {
                return false;
            }
        }
        return true;
    }

     public static void main(String[] args) {
        System.out.println(anagrams("listen", "silent"));   // true
        System.out.println(anagrams("hello", "world"));     // false
        System.out.println(anagrams("abb", "acc"));         // false
    }
}
