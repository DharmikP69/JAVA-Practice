import java.util.*;

public class J66 {

    public static List<Integer> uniqueInArrays(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                answer.add(num);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 2, 3, 4 };
        List<Integer> ans = uniqueInArrays(a, b);

        for (int num : ans) {
            System.out.print(" " + num);
        }

    }

}
//output : 2 3