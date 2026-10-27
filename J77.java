import java.util.*;
public class J77 {

    public static void sortColors(int[] nums) {
       
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 2, 0, 0, 1, 2, 0, 2, 1 };
         int z = 0;
        int o = 0;
       // int t = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                z++;
            else if (nums[i] == 1)
                o++;
        }

        for (int i = 0; i < z; i++) {
            nums[i] = 0;
        }

        for (int i = z; i < z + o; i++) {
            nums[i] = 1;
        }

        for (int i = z + o; i < nums.length; i++) {
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
