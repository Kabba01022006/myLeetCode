1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(nums.length==1){
4            if(nums[0]>=k) return 0;
5            else return 1;
6        }
7        // 10 5 2 6 
8        int left=0;
9        int right=0;
10        int pro=1;
11        int count=0;
12        while(right<nums.length){
13            pro=pro*nums[right];
14            while(pro>=k){
15                pro=pro/nums[left];
16                left++;
17            }
18            count+=right-left+1;
19            right++;
20        }
21        return count;
22    }
23}