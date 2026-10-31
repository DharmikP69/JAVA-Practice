public class J105 {
    public static  int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        
        while(i <= j){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(arr1, val));

        int[] arr2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(arr2, val2));

        int[] arr3 = {1};
        int val3 = 1;
        System.out.println(removeElement(arr3, val3));

        int[] arr4 = {2,2,2};
        int val4 = 2;
        System.out.println(removeElement(arr4, val4));

        int[] arr5 = {1,2,3};
        int val5 = 5;
        System.out.println(removeElement(arr5, val5));
        
    }
}
// 2
// 8
// 0
// 0
// 3