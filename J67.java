import java.util.*;

public class J67 {

    public static List<Integer> uniqueFirstArray(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        for (int num : arr1) {
            if (!set.contains(num)) {
                answer.add(num);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 2, 3, 4 };
        List<Integer> ans = uniqueFirstArray(a, b);

        for (int num : ans) {
            System.out.print(" " + num);
        }

    }

}
//output : 1