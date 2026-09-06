1class Solution {
2    public int maxProfit(int[] prices) {
3        // if (prices.length==1) return 0;
4        int i=prices.length-2;
5        int maxFuture=prices[prices.length-1];
6        int maxPro=0;
7        while(i>=0){
8            maxPro = Math.max(maxPro,maxFuture-prices[i]);
9            maxFuture = Math.max(maxFuture,prices[i]);
10            i--;
11        }
12        return maxPro;
13    }
14}