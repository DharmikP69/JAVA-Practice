import java.util.HashSet;
public class J59{
    public static void main(String[] args) {
        HashSet<Character> vowels = new HashSet<>();

        String s = "education";

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (char ch : s.toCharArray()) {
            if(vowels.contains(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
//5