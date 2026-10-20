// Display all elements of the stack from top to bottom
public class J45 {
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

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        J45 s = new J45();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(100);
        s.display();
    }
}
// Output : 100 40 30 20 10