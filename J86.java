public class J86 {
    public static int maxProfit(int[] prices) {
        int low = prices[0];
    
        int maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(low > prices[i]){
                low = prices[i];
            }
            

            maxProfit = Math.max(prices[i] - low,maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
