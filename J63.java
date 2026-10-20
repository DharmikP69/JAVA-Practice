import java.util.*;

public class J63 {
    public static List<Integer> printFirstDuplicate(int[] arr){
        List<Integer> answer = new ArrayList<Integer>() ;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if(!set.contains(num)){
                answer.add(num);
            }
            set.add(num);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,1,2,2,8};

        List<Integer> ans = printFirstDuplicate(arr);

        for (int num : ans) {
            System.out.print("    "+num);
        }
    }
}
