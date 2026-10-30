public class J102 {

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int water = 0;

        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);

            int a = w * h;
            water = Math.max(water, a);

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] a = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(maxArea(a));
        System.out.println(maxArea(new int[] { 1, 1 }));
        System.out.println(maxArea(new int[] { 4, 3, 2, 1, 4 }));
    }
}
