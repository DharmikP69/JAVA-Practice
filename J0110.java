public class J0110 {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return isPal(s,left+1,right) || isPal(s,left,right-1);
            }
            right--;
            left++;
        }

        return true;
    }

    public static boolean isPal(String s,int l, int r){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        

        String s2 = "abcda";
        System.out.println(validPalindrome(s2));
        //false

        String s3 = "abbca";
        System.out.println(validPalindrome(s3));
        //true

        String s4 = "eedede";
        System.out.println(validPalindrome(s4));
        //true

        String s5 = "ab";
        System.out.println(validPalindrome(s5));
        //true
    }
}
