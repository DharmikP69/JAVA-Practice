import java.util.*;

public class J57 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "hello";

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(" " + e.getKey() + " -> " + e.getValue());
        }
    }
}
