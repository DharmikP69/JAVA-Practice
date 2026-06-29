public class J29 {
    public static int[] mergeSortedArray(int[] nums1, int[] nums2) {
        int i = 0; // for nums1
        int j = 0; // for nums2
        int k = 0; // for ans
        int[] ans = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                ans[k] = nums2[j];
                j++;
            } else {
                ans[k] = nums1[i];
                i++;
            }
            k++;
        }
        
            while (i < nums1.length) {
                ans[k] = nums1[i];
                i++;
                k++;
            }

            while (j < nums2.length) {
                ans[k] = nums2[j];
                j++;
                k++;
            }
            for (int index = 0; index < ans.length; index++) {
                ans[index] = ans[index]* ans[index];
            }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        int[] array = mergeSortedArray(arr1, arr2);

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
