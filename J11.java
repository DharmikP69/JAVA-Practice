public class J11 {
    public static int largestElement(int[] arr,int size){
        int max = arr[0];
        int largerindex = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
                largerindex = i;
            }
        }
        return largerindex;
    }
    public static int smallestElement(int[] arr,int size){
        int min = arr[0];
        int smallerindex = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
                smallerindex = i;
            }
        }
        return smallerindex;
    }
    public static void main(String[] args) {

        int[] arr = {73, 15, 99, 42, 18, 150, 67, 120};
        
        int largerindex = largestElement(arr,arr.length);

        System.out.println("Largest Element = " + arr[largerindex]);
        System.out.println("Index = " + largerindex);

        int smallerindex = smallestElement(arr,arr.length);

        System.out.println("Smallest Element = " + arr[smallerindex]);
        System.out.println("Index = " + smallerindex);
    }
}