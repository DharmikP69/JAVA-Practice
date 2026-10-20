import java.util.HashMap;

public class J55 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aarav", 78);
        map.put("Meera", 91);
        map.put("Rahul", 64);
        map.put("Priya", 85);
        map.put("Kabir", 72);


        System.out.println(map.size());

        map.remove("Kabir");

        System.out.println(map.size());

        map.remove("Kunal");

        System.out.println(map.size());
    }
}
//output :5
//4
//4