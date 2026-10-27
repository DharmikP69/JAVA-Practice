public class J74 {

    public static int largestRectangleArea(int[] heights) {
        int i = 1;
        int res = heights[0];

        while (i <= heights.length - 1) {
            int min = Math.min(heights[i], heights[i - 1]);

            int temp = 2 * min;

            if (temp > res) {
                res = temp;
            }

            if (heights[i] > res) {
                res = heights[0];
            }

            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(largestRectangleArea(arr));
        int[] num = {1,3};
        System.out.println(largestRectangleArea(num));
    }
}
