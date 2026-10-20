import java.util.*;

public class J68 {
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = { -1, -1 }; // int[2] becasue there is only two elements [num,diff];
        int diff;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
           
            diff = target - arr[i];

            if (map.containsKey(diff)) {
                ans[0] = i;
                ans[1] = map.get(diff);
                return ans;
            }

             map.put(arr[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] ans = twoSum(nums, target);

        for (int i : ans) {
            System.out.print(" " + i);
        }
    }
}
