import java.util.*;

public class J58 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 4, 2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int maxCount = 0;
        int result = 0;

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
           if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                result = e.getKey();
            }
        }

        System.out.println(result);
    }
}
