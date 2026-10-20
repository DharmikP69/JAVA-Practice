import java.util.Stack;
public class J41 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack);
        System.out.println("Size of the stack : " + stack.size());
        System.out.println("The first element in stack : " + stack.peek());
        System.out.println("Removed the first index : " + stack.pop());
        System.out.println("Removed the second index : " + stack.pop());
        System.out.println("Removed the third index : " + stack.pop());
        System.out.println("Checking if the stack is empty or not : " + stack.isEmpty()); 
    }    
}
