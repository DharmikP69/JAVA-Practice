public class J71 {
    public static int findMaxOnes(int[] arr) {
        int max = 0; // To find theconsecutive ones
        int cur = 0; // To track how many continuos ones are scanned
        for (int num : arr) {
            if (num == 1) { // If 1 then increas the cur by 1
                cur++;

                if (cur > max) {
                    max = cur;
                }

            } else {
                cur = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 0, 1, 1, 1 };
        int[] arr2 = { 1, 0, 1, 1, 0, 1 };

        System.out.println(findMaxOnes(arr1));
        System.out.println(findMaxOnes(arr2));
    }
}
