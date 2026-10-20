public class J36 {
    public static void recursion(int n) {
        if (n == 0) {
            return;
        }

        recursion(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        recursion(5);
    }
}
