import java.util.Scanner;
public class J19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;

        System.out.print("Enter elements for 3 x 3 matrix : ");

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j] ;
            }
        }

        System.out.println("The sum of matrix is : " + sum);

        sc.close();
    }
}
// Output : Enter elements for 3 x 3 matrix : 1 2 3 4 5 6 7 8 9 
// 1 2 3 
// 4 5 6 
// 7 8 9 
// The sum of matrix is : 45