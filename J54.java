import java.util.HashMap;
import java.util.Map;

public class J54 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aarav", 78);
        map.put("Meera", 91);
        map.put("Rahul", 64);
        map.put("Priya", 85);
        map.put("Kabir", 72);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(" "+ e.getKey() + " -> "+ e.getValue());
        }
    }
}
