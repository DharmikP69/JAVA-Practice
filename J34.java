import java.util.HashMap;

public class J34 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,4,1,6,8,9,4,8,1,5,3,6,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
