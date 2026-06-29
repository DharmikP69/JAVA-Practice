public class J15 {
    public static int oddCount(int[] arr){
        int oddcount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                oddcount ++;
            }
        }
        return oddcount;
    }
     public static int evenCount(int[] arr){
        int evencount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) {
                evencount ++;
            }
        }
        return evencount;
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 20, 33, 40};

        int countEven = evenCount(arr);
        System.out.println("Count of Even numbers = " + countEven);

        int countOdd = oddCount(arr);
        System.out.println("Count of Odd numbers = " + countOdd);
    }
    
}
