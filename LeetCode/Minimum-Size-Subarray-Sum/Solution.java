1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i=0;
4        int sum=0;
5        while(sum<target && i<nums.length){
6            sum+=nums[i];
7            i++;
8        }
9        if(i==nums.length && sum<target) return 0;
10
11        int left = 0;
12        int right = i-1;
13        int minLen = right-left+1;
14        while(right<nums.length){
15            while(sum>=target){
16                sum-=nums[left];
17                left++;
18                if(sum>=target) minLen  = Math.min(minLen,right-left+1);
19            }
20            right++;
21            if(right<nums.length) sum+=nums[right];
22        }
23        return minLen;
24    }
25}