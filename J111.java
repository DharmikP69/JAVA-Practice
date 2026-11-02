import java.util.Arrays;

public class J111 {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[][] test = {{0,1,0,2,1,0,1,3,2,1,2,1},
                        {4,2,0,3,0,5},
                        {4,2,0,3,2,5},
                        {3,0,3},
                        {2,0,2},
                        {3,2,1,2,3},
                        {5,4,1,2},
                        {1,2,3,4},
                        {4,3,2,1},
                        {0,0,0},
                        {5}
        };

        for(int[] arr : test){
            System.out.println(Arrays.toString(arr) + " stores " + trap(arr) + " unit water.");
        }

        
    }
}
//Output:
// [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] stores 6 unit water.
// [4, 2, 0, 3, 0, 5] stores 11 unit water.
//[4, 2, 0, 3, 2, 5] stores 9 unit water.
// [3, 0, 3] stores 3 unit water.
// [2, 0, 2] stores 2 unit water.
// [3, 2, 1, 2, 3] stores 4 unit water.
// [5, 4, 1, 2] stores 1 unit water.
// [1, 2, 3, 4] stores 0 unit water.
// [4, 3, 2, 1] stores 0 unit water.
// [0, 0, 0] stores 0 unit water.
// [5] stores 0 unit water.