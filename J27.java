public class J27 {
    public static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }   
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr= {2, 1, 6, 8, 7, 5, 3, 4};
        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
