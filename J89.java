import java.util.HashMap;
import java.util.Map;

public class J89 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        System.out.println(singleNumber(a));
    }
}
