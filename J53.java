import java.util.*;

public class J53 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aarav", 78);
        map.put("Meera", 91);
        map.put("Rahul", 64);
        map.put("Priya", 85);
        map.put("Kabir", 72);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search : ");
        String target = sc.next();
//containskey -> if in the map then true if not then false
        if(map.containsKey(target)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();

    }
}
