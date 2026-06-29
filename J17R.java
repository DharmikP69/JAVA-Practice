public class J17R{

    public static int secondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            }

            else if(arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 23, 67, 91, 34};

        int result = secondLargest(arr);

        System.out.println("Second Largest = " + result);
    }
}