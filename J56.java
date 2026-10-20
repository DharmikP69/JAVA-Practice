import java.util.*;

public class J56 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()){
           System.out.println(" "+ e.getKey() + " -> "+ e.getValue());
        }
    }
}
//Output :
// /1 -> 1
//  2 -> 3
//  3 -> 1