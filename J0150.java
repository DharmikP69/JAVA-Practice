public class J0150 {

    static int divide(int a, int b) { return a / b; }

    static String test1() {
        try {
            System.out.println("A");
            int x = divide(10, 0);
            System.out.println("B");
            return "try";
        } catch (ArithmeticException e) {
            System.out.println("C");
            return "catch";
        } finally {
            System.out.println("D");
        }
    }

    static int test2() {
        try {
            return 1;
        } finally {
            System.out.println("F");
        }
    }

    static void test3() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arith");
        } catch (NullPointerException e) {
            System.out.println("NPE");
        } finally {
            System.out.println("done3");
        }
    }

    static void test4() throws Exception {
        throw new Exception("checked");
    }

    public static void main(String[] args) {
        System.out.println(test1());                       // P1 A it is first so it prints then exception happend
        //  C there is arithmataic exception so it throw error and C prints D finally is print if there is any 
        //  error or exception and catch in the last
        System.out.println(test2());                       // P2 F 1
        test3();                                           // P3 NPE

        try {
            int[] arr = new int[3];
            arr[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());           // P4 done3 Index 3 out of bounds for length 3
        }

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());           // P5 For input string: "abc"
        }

        // test4();                                        // P6: unreported exception; must be caught or declared to throw
    }
}
//Output :
// A
// C
// D
// catch
// F
// 1
// NPE
// done3
// Index 3 out of bounds for length 3
// For input string: "abc"