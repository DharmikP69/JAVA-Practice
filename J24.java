//floor number : Greatest number smaller than or equal to the target.
public class J24 {
    public static int floor(int[] nums, int target){
        if(target < nums[0]){
            return -1;
        }
        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }
        return nums[end];
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ans = floor(arr, target);

        System.out.println(ans);
    }
}
