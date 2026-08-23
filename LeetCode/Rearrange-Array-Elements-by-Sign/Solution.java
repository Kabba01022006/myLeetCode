1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        //zero isnt present in nums
4        int[] ans = new int[nums.length];
5        int posWriteElem=0;
6        int posWriteInd=0;
7
8        int negWriteElem=0;
9        int negWriteInd=1;
10        int i=0;
11        while(i<nums.length && posWriteInd<nums.length-1){
12            if(nums[i]>0){
13                posWriteElem=nums[i];
14                ans[posWriteInd]=posWriteElem;
15                posWriteInd+=2;
16            }
17            i++;
18        }
19        i=0;
20        while(i<nums.length && negWriteInd<nums.length){
21            if (nums[i]<0){
22                negWriteElem=nums[i];
23                ans[negWriteInd]=negWriteElem;
24                negWriteInd+=2;
25            }
26            i++;
27        }
28        return ans;
29    }
30}