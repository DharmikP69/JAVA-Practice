import java.util.Stack;
public class J43 {
    static int precedence (char ch){
        switch(ch){
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;     
        }
    }

    static String InfixtoPostfix(String expression){
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);


            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            } else if (ch == '('){
                stack.push(ch);
            } else if (ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String infix = "A+B*C%D^E";
        String postfix = InfixtoPostfix(infix);

        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + postfix);
    }
}
