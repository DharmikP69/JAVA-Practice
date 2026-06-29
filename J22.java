public class J22 {
    public static int orderAgnosticBinarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length -1 ;
        
        boolean isAsc = nums[start] <= nums[end];

        while(start <= end){
            int mid = start + ( end -start ) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else {
                if(target < nums[mid]){
                    start = mid + 1;
                } else { 
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {99, 80, 70, 50, 20, 10, 5};
        int target = 20;

        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
}
