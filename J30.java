//Sliding Window
public class J30 {
    public static int maxSumOfSubArray (int[] arr,int k){
        int currentSum = 0;
        for (int index = 0; index < k; index++) {
            currentSum += arr[index];
        }
        int maxSum = currentSum;

        for (int i = 1; i <= arr.length - k; i++){
            currentSum = currentSum - arr[i-1] + arr[i+k-1];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,2,5,7,6,12};
        int k = 4;

        int ans = maxSumOfSubArray(arr, k);
        System.out.println(ans);
    }
}