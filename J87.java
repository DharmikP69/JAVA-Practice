import java.util.*;

public class J87 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > nums.length/2){
                return e.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {2,2,3,3,3,3,9};
        System.out.println(majorityElement(num));
    }
}
