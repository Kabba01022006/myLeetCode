1class Solution {
2    public int maxSubArray(int[] nums) {
3        
4        int sum=0;
5        int maxSum = Integer.MIN_VALUE;
6        //if our running sum was -2 and we encounter 4, we have two choices , either to do -2+4 = 2 , or to start our subarray from 4 itself , so starting from 4 is the better choice
7        for(int i=0;i<nums.length;i++){
8            if(sum+nums[i]<nums[i]){
9                sum=nums[i];
10            }
11            else{
12                sum+=nums[i];
13            }
14            maxSum = Math.max(maxSum,sum);
15        }
16        return maxSum;
17    }
18}