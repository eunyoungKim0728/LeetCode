class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        int profit = 0;
        int recentPrice = 0;
        for (int i : prices) {
            min = Math.min(min, i);
            recentPrice = i;
            if(min < recentPrice){
                profit = recentPrice - min;
                max_profit = Math.max(max_profit, profit);
            } 
        }
        if(max_profit < 0){
            return 0;
        }
    
        return max_profit;
    }
}