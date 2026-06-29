public class J13 {
    public static double average(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        double averageOfArray = average(arr);

        System.out.println("Average of Array = " + averageOfArray);
    }
    
}
