import java.util.*;

public class J0114 {
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = prices[i];
            } else {
                answer[i] = prices[i] - stack.peek();
            }

            stack.push(prices[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 2, 3};

        System.out.println(Arrays.toString(finalPrices(arr)));
    }
}