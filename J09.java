import java.util.Scanner;
public class J09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        System.out.println("Enter the 3 numbers : ");
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Numbers : ");
        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
