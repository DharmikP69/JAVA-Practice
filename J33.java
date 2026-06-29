public class J33 {
    public static void main(String[] args) {
        String s = "abcdgejgghstegaaashfgem";

        int[] hash = new int[26];

        for (int index = 0; index < s.length() ; index++) {
            hash[s.charAt(index) - 'a']++;
        }

        System.out.println(hash[0]);
    }
}
