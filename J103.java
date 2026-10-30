import java.util.Arrays;

public class J103 {

    static void changeNumber(int x) {
        x = 100;
    }

    static void changeArray(int[] arr) {
        arr[0] = 100;
    }

    static void replaceArray(int[] arr) {
        arr = new int[]{7, 7, 7};
    }

    static void changeString(String s) {
        s = s + " World";
    }

    public static void main(String[] args) {
        int n = 5;
        changeNumber(n);
        System.out.println(n);                    // My prediction: 5 becasue thr value is change for the changeNumber() this function only that does no reflect the change in the main

        int[] a = {1, 2, 3};
        changeArray(a);
        System.out.println(Arrays.toString(a));   // My prediction: a store reference of the a and arr use that reference so its reflcet the chnages in th main becasue both are pointing to same memory block

        int[] b = {1, 2, 3};
        replaceArray(b);
        System.out.println(Arrays.toString(b));   // My prediction: new int[] creates new array at compeletely new memory location so that it is isolated

        String str = "Hello";
        changeString(str);
        System.out.println(str);                  // My prediction: Cause the String are immutable the output will be "Hello" only
    }
}

//Output :
// 5
// [100, 2, 3]
// [1, 2, 3]
// Hello