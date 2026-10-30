import java.util.Arrays;

public class J101 {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 1;

        while (k < nums.length) {

            if (nums[i] == nums[k]) {
                k++;
            } else {
                i++;
                nums[i] = nums[k];
                k++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[][] tests = {
                { 0, 0, 1, 1, 1, 2, 2, 3 },
                { 1, 1, 2 },
                { 5 },
                { 1, 1, 1 }
        };
        for (int[] arr : tests) {
            int k = removeDuplicates(arr);
            System.out.println(k + " " + Arrays.toString(Arrays.copyOf(arr, k)));
        }
    }
}
