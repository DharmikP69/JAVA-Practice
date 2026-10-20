public class J48 {
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

    public void search(int target){
        if(top == -1){
            System.out.println("Stack is empty.");
            return;
        }
    

        for (int index = top; index >= 0; index--) {
            if(arr[index] == target){
                System.out.println("The element " + target + " is at position " + (top - index + 1) + " from the top.");
                return;
            }
            
        }

        System.out.println("Element " + target + " not found");
    }

     public static void main(String[] args) {
        J48 s = new J48();
        s.push(10);//arr[0]
        s.push(20);//arr[1]
        s.push(30);//arr[2]
        s.push(40);//arr[3]
        s.push(100);//arr[4]
        s.search(40);
    }    
}
