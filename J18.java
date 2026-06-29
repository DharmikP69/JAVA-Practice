import java.util.Scanner;

public class J18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[][] arr = new int[2][3];

        System.out.print("Enter elements for 2-D Array : ");
        
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
        sc.close();

    }
    
}
// Output : Enter elements for 2-D Array : 1 2 3 4 5 6 
// 1 2 3 
// 4 5 6  