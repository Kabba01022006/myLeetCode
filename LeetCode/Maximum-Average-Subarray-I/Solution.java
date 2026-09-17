1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0 ;
4        int l=0;
5        int r=k-1;
6        for(int i=0;i<=r;i++){
7            sum+=nums[i];
8        }
9        int maxSum=sum;
10        while(r<nums.length-1){
11            sum-=nums[l];
12            l++;
13            r++;
14            sum+=nums[r];
15            maxSum=Math.max(maxSum,sum);
16        }
17        return (double)maxSum/k; //or we can simply make maxSum double when declaring
18    }
19}