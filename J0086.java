public class J0086 {
    public static int maxProfit(int[] prices) {
        int low = prices[0];

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (low > prices[i]) {
                low = prices[i];
            }

            maxProfit = Math.max(prices[i] - low, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 })); // 5
        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 })); // 0
    }
}
