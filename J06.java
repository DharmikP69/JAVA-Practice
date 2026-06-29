import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to print it's factorial : ");
        int n = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + n + " (" + n +"!) is " + factorial );
        sc.close();

    }
}
