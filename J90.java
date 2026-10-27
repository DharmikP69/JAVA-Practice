public class J90 {
    public static void runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        
        for(int num : prefix){
            System.out.print(num + " ");
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1,1,1,1,1};
        int[] arr3 = {3,1,2,10,1};
        int[] arr4 = {5};
        int[] arr5 = {-1,2,-3};

        System.out.println("For array 1");
        runningSum(arr1);
        System.out.println("For array 2");
        runningSum(arr2);
        System.out.println("For array 3");
        runningSum(arr3);
        System.out.println("For array 4");
        runningSum(arr4);
        System.out.println("For array 5");
        runningSum(arr5);
    }
}
//Output : 
// For array 1
// 1 3 6 10 
// For array 2
// 1 2 3 4 5 
// For array 3
// 3 4 6 16 17 
// For array 4
// 5 
// For array 5
// -1 1 -2 