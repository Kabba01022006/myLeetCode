1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        // make one extra array
4        int[] minArr = new int[nums.length];
5        int max = Integer.MIN_VALUE;
6        int min = Integer.MAX_VALUE;
7        for(int i=nums.length-1;i>=0;i--){
8            if(nums[i]<min){
9                min=nums[i];
10            }
11            minArr[i]=min;
12        }
13        for(int i=0;i<nums.length;i++){
14            max = Math.max(max,nums[i]);
15            if(max-minArr[i]<=k) return i;
16        }
17        return -1;
18    }
19}
20