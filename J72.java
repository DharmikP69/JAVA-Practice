public class J72 {
    public static int[] concatenation(int[] nums){
        int n = nums.length;
        int[] answer = new int[2 * n];

        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
            answer[i + n] = nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        int[] ans = concatenation(arr);

        for(int num : ans){
            System.out.print(" " + num);
        }
    }
}
