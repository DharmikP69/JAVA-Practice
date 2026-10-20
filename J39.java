public class J39{
    public static int[] prefix(int[] nums){
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        int[] ans = prefix(arr);
        for (int n : ans) {
            System.out.print(n + " ");
        }
    }
}