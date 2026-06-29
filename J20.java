import java.util.Scanner;
public class J20 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.print("Enter elements for 3 x 3 matrix : ");

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j]; 
            }
            System.out.println("The sum of the " + i + " row is " + sum);
        }
        sc.close();

    }
}
