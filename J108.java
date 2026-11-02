import java.util.*;

public class J108 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>= 0){

            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i]; 
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m1=3;
        int n2=3;

        merge(nums1,m1,nums2,n2);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int[] nums4 = {};
        int m3 = 1;
        int n4 = 0;

        merge(nums3, m3, nums4, n4);
        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int[] nums6 = {1};
        int m5 = 0;
        int n6 = 1;

        merge(nums5, m5, nums6, n6);
        System.out.println(Arrays.toString(nums5));

        int[] nums7 = {4,5,6,0,0,0};
        int[] nums8 = {1,2,3};
        int m7 = 3;
        int n8 = 3;

        merge(nums7, m7, nums8, n8);
        System.out.println(Arrays.toString(nums7));

    }
}
//Output :
// [1, 2, 2, 3, 5, 6]
// [1]
// [1]
// [1, 2, 3, 4, 5, 6]