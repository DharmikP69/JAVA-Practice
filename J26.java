public class J26 {
    public static void bubbleSort(int[] nums){
        boolean swapped = true;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1672,1,1295,1929,1480,1470,1365,744,34,852,162,26,977,
            3689,1342,2169,9,7,75,167,15,16,507,509,704,2529,1351,2769,53,136
        };
        bubbleSort(arr);
        System.out.println("Size : "+arr.length);
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
