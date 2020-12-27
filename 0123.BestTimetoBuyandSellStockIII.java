class Solution {
    public int maxProfit(int[] prices) {
         if(prices.length == 0){
            return 0;
        }
        int dp[][] = new int[3][prices.length];

        for(int i=1;i<3;i++){
            int maxProfit = -prices[0];
            for(int j=1; j< prices.length;j++){    
                dp[i][j] = Math.max(dp[i][j-1], prices[j]+maxProfit);
                maxProfit = Math.max(maxProfit, dp[i-1][j] - prices[j]);
            }
        }

        return dp[2][prices.length-1]; 
    }
}