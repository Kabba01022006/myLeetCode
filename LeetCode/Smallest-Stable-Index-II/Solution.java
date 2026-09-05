1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int[] minArr = new int[nums.length];
4        int max = Integer.MIN_VALUE;
5        int min = Integer.MAX_VALUE;
6        for(int i=nums.length-1;i>=0;i--){
7            if(nums[i]<min){
8                min=nums[i];
9            }
10            minArr[i]=min;
11        }
12        for(int i=0;i<nums.length;i++){
13            max = Math.max(max,nums[i]);
14            if(max-minArr[i]<=k) return i;
15        }
16        return -1;
17    }
18}