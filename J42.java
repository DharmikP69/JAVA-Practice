import java.util.Stack;

public class J42 {
   public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "HELLO";

        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

       while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
   }

}
