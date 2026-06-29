public class J32 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,4,1,6,8,9,4,8,1,5,3,6,5};

        int[] hash = new int[17];

        for( int num : arr){
            hash[num]++;
        }
        System.out.println(hash[1]);
        System.out.println(hash[3]);
        System.out.println(hash[4]);
        System.out.println(hash[5]);
        System.out.println(hash[6]);
        System.out.println(hash[8]);
        System.out.println(hash[9]);
    }
}
