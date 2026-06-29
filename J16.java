import java.util.Scanner;
public class J16 {
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i * i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = sc.nextInt();

        if(isPrime(number)){
             System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is NOT Prime");
        }
        sc.close();
    }
}
