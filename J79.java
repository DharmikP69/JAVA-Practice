public class J79 {
     public static int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 1;

        while (k < nums.length){

            if(nums[i] == nums[k]){
                k++;
            } else {
                i++;
                nums[i] = nums[k];
                k++;
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));;
    }
}
