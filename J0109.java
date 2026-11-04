import java.util.*;

public class J0109 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int left = i+1;
            int right = nums.length - 1;
            int sum = -1*nums[i];
            while(left < right){
                int s = nums[left] + nums[right];
                if(s == sum){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < nums.length && nums[left] == nums[left -1]){
                        left++;
                    }
                    while(right >= 0 && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (s < sum){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer1 = threeSum(a);

        System.out.println(answer1);

        int[] b = {0,0,0};
        List<List<Integer>> answer2 = threeSum(b);
        System.out.println(answer2);

        int[] c = {0,1,1};
        List<List<Integer>> answer3 = threeSum(c);
        System.out.println(answer3);

        int[] d = {-2,0,0,2,2};
        List<List<Integer>> answer4 = threeSum(d);
        System.out.println(answer4);
    }
}
//Output :
//  [[-1, -1, 2], [-1, 0, 1]]
//  [[0, 0, 0]]
//[]
//[[-2, 0, 2]]