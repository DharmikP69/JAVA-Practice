import java.util.HashSet;

public class J0119 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3)); // true
        System.out.println(containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1)); // true
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2)); // false
    }
}
