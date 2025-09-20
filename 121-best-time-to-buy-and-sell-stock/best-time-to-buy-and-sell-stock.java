class Solution {
    public int maxProfit(int[] prices) {
        // int buyPrice = Integer.MAX_VALUE;
        // int maxprofit = 0;
        // for(int i = 0; i< prices.length; i++){
        //     if( buyPrice < prices[i]){
        //         int profit = prices[i] - buyPrice;
        //         maxprofit = Math.max(maxprofit , profit);
        //     } else {
        //         buyPrice = prices[i];
        //     }
        // }
        // return maxprofit;

        // int n = prices.length;
        // int res = 0;

        // for(int i=0; i < n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         res = Math.max(res, prices[j] - prices[i]);
        //     }
        // }
        // return res;

        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
      	// if we see smaller
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
           
            // Update result if we get more profit                
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
}