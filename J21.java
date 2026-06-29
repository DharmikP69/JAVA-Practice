public class J21 {

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
          int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 1;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }
}
