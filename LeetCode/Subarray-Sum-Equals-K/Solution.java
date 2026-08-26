1//brute force
2class Solution {
3    public int subarraySum(int[] nums, int k) {
4        int count=0;
5        for(int i=0;i<nums.length;i++){
6            int sum=0;
7            for(int j=i;j<nums.length;j++){
8                sum+=nums[j];
9                if(sum==k) count++;
10            }
11        }
12        return count;
13    }
14}