public class J0134 {

    public static int lengthOfLastWord(String s) {
    
        int i = s.length() - 1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] inputs = {
            "Hello World",
            "   fly me   to   the moon   ",
            "luffy is still joyboy",
            "a",
            "   "
        };

        for (String s : inputs) {
            System.out.println("\"" + s + "\" -> " + lengthOfLastWord(s));
        }
    }
}
//Output :
// "Hello World" -> 5
// "   fly me   to   the moon   " -> 4
// "luffy is still joyboy" -> 6
// "a" -> 1
// "   " -> 0