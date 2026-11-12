public class J0132 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = s3.intern();
// intern(): intern() looks in the pool for the same text and returns the pool object’s reference. That’s the same object s1 
//           points to, so true.
        System.out.println(s1 == s2);          // Q1 true 
        System.out.println(s1 == s3);          // Q2 false Both s1 and s3 are references to String objects. s1 points to the object in 
        // the String pool. new String("java") forces a separate object on the heap. == compares addresses, so false.
        System.out.println(s1.equals(s3));     // Q3 true
        System.out.println(s1 == s4);          // Q4 true

        String a = "hello";
        a.toUpperCase();
        System.out.println(a);                 // Q5 hello change to the uppercase but did not refrenced yet still point to the old "
        // hello".

        a = a.toUpperCase();    // It change hello to the uppercase and refrenced also so now a = "HELLO".
        System.out.println(a);                 // Q6 HELLO

        final String x = "ab";
        String y = x + "c";
        String z = "abc";
        System.out.println(y == z);            // Q7 false That doesn’t explain it. x + "c" is calculated at runtime because x is a 
        // normal variable. That creates a new object on the heap. z = "abc" is a literal in the pool. Different objects, so == is false. 
        System.out.println(y.equals(z));       // Q8 true

        StringBuilder sb = new StringBuilder("ab");
        sb.append("c").append(1).reverse();
        System.out.println(sb);                // Q9 1cba initially ab then added c so string become abc then added 1 so string become
        //  abc1 and them reverse 1cba
        System.out.println(sb.length());       // Q10 4
    }
}
//Output:
// true
// false
// true
// true
// hello
// HELLO
// false
// true
// 1cba
// 4