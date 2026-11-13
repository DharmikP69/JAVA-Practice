//Ascii value of 'a' = 97 
//Ascii value of 'A' = 65
public class J0137 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("de");                                 // abcde
        sb.reverse();                                    
        System.out.println(sb);                          // Q1 edcba

        sb.insert(0, "X");                               // Xedcba
        sb.deleteCharAt(1);                              // Xdcba
        System.out.println(sb);                          // Q2 Xdcba

        char c = 'd';
        System.out.println(c - 'a');                     // Q3 'd' - 'a' = 3 (ASCII vlue of 'd' - ASCII value of 'a' )
        System.out.println((char) (c + 1));              // Q4 c + 1 = 'd' + 1 = 100 + 1 = 101 -> 'e'
        System.out.println(c + 1);                       // Q5 c + 1 = 'd' + 1 = 100 + 1 = 101

        String s = "hello";
        char[] arr = s.toCharArray();
        arr[0] = 'J';
        System.out.println(s);                           // Q6 hello, In this line the s still point to the "hello"
        System.out.println(new String(arr));             // Q7 Jello, In this arr point the char[] and the first index is change to 'J'

        System.out.println("a,b,,c".split(",").length);  // Q8 ["a","b","","c"] -> length = 4
        System.out.println("  hi  ".trim().length());    // Q9 2
        System.out.println("a,b,,".split(",").length);   // Q10 ["a","b"] -> length = 2
    }
}
//Output :
// edcba
// Xdcba
// 3
// e
// 101
// hello
// Jello
// 4
// 2
// 2