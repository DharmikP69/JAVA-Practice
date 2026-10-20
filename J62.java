import java.util.HashSet;

public class J62 {
    public static int printFirstDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,4,9};

        int answer = printFirstDuplicate(arr);
        
        if(answer == -1){
             System.out.println("No duplicate numbers");
        } else {
            System.out.println(answer);
        }
    }
}
