import java.util.*;

public class J60 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        String sentence = "to be or not to be";

        String[] words = sentence.split(" ");

        for (String num : words) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       int count = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
