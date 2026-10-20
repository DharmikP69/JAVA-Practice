public class J46 {
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

    public void count(){
        System.out.println(top+1);
    }

    public static void main(String[] args) {
        J46 s = new J46();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(100);
        s.count();
    }
}
