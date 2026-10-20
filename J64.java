import java.util.*;

public class J64 {
    public static boolean unique(String s){
        HashSet<Character> map = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if(map.contains(ch)){
                return false;
            }
            map.add(ch);
        }

         return true;
    }

    public static void main(String[] args) {
        System.out.println(unique("hello"));
        System.out.println((unique("abc")));
    }
}
//Output : false
//true
