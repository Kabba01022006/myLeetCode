1class Solution {
2    public void rotate(int[] nums, int k) {
3        //using extra space
4        int[] ans = new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            int newInd = (i + k)% nums.length;
7            ans[newInd] = nums[i];
8        }
9        for(int i=0;i<nums.length;i++){
10            nums[i] = ans[i];
11        }
12    }
13}