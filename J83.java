public class J83 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int n1 = n * (n+1);
        int n2 = n1 / 2;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        return n2-sum;
    }

    public static void main(String[] args) {
        int[] num = {3,0,1};
        System.out.println(missingNumber(num));
    }
}
