import java.util.Scanner;
public class J10 {
    public static int linearSearch(int[] array, int size, int target){
        for(int i = 0; i < size; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 45, 7, 89, 23, 56, 91};
        int target = 23;
        int result = linearSearch(arr,arr.length,target);

        if(result == -1){
            System.out.println("The target is not in the Array");
        } else {
            System.out.println("The target is in the Array at index(starts from 0) " +result);
        }
        sc.close();
    }
}