import java.util.*;

public class J69 {
    public static boolean makeTarget(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int diff = target - num;

            if (set.contains(diff)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 1 };
        int target = 8;

        System.out.println(makeTarget(nums, target));
    }
}
