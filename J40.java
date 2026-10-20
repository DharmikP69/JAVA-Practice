public class J40 {
    public static int[] suffix(int[] nums){
        int[] suffix = new int[nums.length];

        suffix[nums.length-1] = nums[nums.length-1];

        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        return suffix;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5, 4 };
        int[] ans = suffix(arr);
        for (int n : ans) {
            System.out.print(n + " ");
        }
    }
}
