public class J12 {
    public static int sumOfArray(int[] arr,int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int array_Sum = sumOfArray(arr,arr.length);
        System.out.println("Sum of array = " + array_Sum);
    }
}
