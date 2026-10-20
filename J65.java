import java.util.*;

public class J65 {
    public static char firstunique(String a){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : a.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        for(char ch : a.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return '0';
    }

    public static void main(String[] args) {
        String s = "swiss";
        
        System.out.println(firstunique(s));
    }
}
