public class J112 {
    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            while (l < r && !isVowel(arr[l])) {
                l++;
            }

            while (l < r && !isVowel(arr[r])) {
                r--;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u' || ch == 'A' ||
               ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
    public static void main(String[] args) {
        String[] s = {"hello","leetcode","IceCreAm","aA","aeiou","bcdfg","xyz","ab,eo","a"};

        for(String str : s){
            System.out.println(str + " -> " + reverseVowels(str));
        }
    }
}
//Output : 
// hello -> holle
// leetcode -> leotcede
// IceCreAm -> AceCreIm
// aA -> Aa
// aeiou -> uoiea
// bcdfg -> bcdfg
// xyz -> xyz
// ab,eo -> ob,ea
// a -> a