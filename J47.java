public class J47 {
    private int size = 5;
    private int top = -1;
    private int[] arr = new int[size];

    public void push(int val){
        if(top == size-1){
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        arr[top] = val;
    }

    public void minAndMax(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int index = top; index >= 0; index--) {
            if(arr[index] > max){
                max = arr[index];
            }
            if(arr[index] < min){
                min = arr[index];
            }
        }

        System.out.println("Max element in stack : " + max);
        System.out.println("Min element in stack : " + min);
    }

     public static void main(String[] args) {
        J47 s = new J47();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(100);
        s.minAndMax();
    }    
}
