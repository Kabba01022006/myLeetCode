1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices.length-2;
4        int maxSell=Integer.MIN_VALUE;
5        int maxProfit=0;
6        while(buy>=0){
7            maxSell = Math.max(maxSell,prices[buy+1]);
8            int diff = maxSell - prices[buy];
9            maxProfit = Math.max(maxProfit,diff);
10            buy--;
11        }
12        return maxProfit;
13    }
14}