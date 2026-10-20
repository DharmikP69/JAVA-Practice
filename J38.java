import java.util.Scanner;

public class J38 {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // int nas = fib(n);
        for (int index = 0; index < n; index++) {
            System.out.println(fib(index) + " ");
        }
        sc.close();
    }
}
