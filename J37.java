import java.util.Scanner;

public class J37 {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to print it's factorial : ");
        int n = sc.nextInt();
        int nas = factorial(n);
        System.out.println(nas);
        sc.close();
    }
}
