//the ceiling means:Smallest number greater than or equal to target.
public class J23 {
    public static int ceiling(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        if(target > nums[nums.length-1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }

        return nums[start];
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }   
}
