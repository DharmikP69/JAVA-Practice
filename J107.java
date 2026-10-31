// This covers two gaps from your Tier 1 list, int vs Integer and overflow. Do it as predict first, 
// then run. Write your prediction as a comment above each line, run it, and compare.
public class J107 {
    public static void main(String[] args) {
        // Part 1: == on Integer objects
        Integer a = 127, b = 127;
        Integer c = 128, d = 128;

        // Prediction: true (cached instances from -128 to 127 share reference)
        System.out.println(a == b);

        // Prediction: false (values > 127 allocate distinct objects; == checks reference identity)
        System.out.println(c == d);

        // Prediction: true (.equals checks unwrapped primitive value)
        System.out.println(c.equals(d));

        // Part 2: overflow
        int max = Integer.MAX_VALUE;

        // Prediction: -2147483648 (wraps around to Integer.MIN_VALUE in 32-bit two's complement)
        System.out.println(max + 1);

        // Prediction: -2147483648 (max + 1 overflows as an int BEFORE widening to long)
        long big = max + 1;
        System.out.println(big);

        // Prediction: 2147483648 (explicit cast widens to 64-bit long BEFORE addition)
        long safe = (long) max + 1;
        System.out.println(safe);

        // Part 3: unboxing null
        // Integer x = null;

        // Prediction: Throws java.lang.NullPointerException (compiler inserts x.intValue())
        // int y = x;

        // Prediction: Unreachable code at runtime due to preceding exception
        // System.out.println(y);
    }
}
//Output :
// true
// false
// true
// -2147483648
// -2147483648
// 2147483648
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "<local10>" is null
//         at J107.main(J107.java:36)