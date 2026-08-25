1class Solution {
2    public int majorityElement(int[] nums) {
3        int n=nums.length;
4        int currElem=nums[0];
5        int count=1;
6        for(int i=1;i<n;i++){
7            if(currElem==nums[i]) count++;
8            else count--;
9            if (count==0){
10                currElem=nums[i];
11                count=1;
12            }
13        }
14        return currElem;
15    }   
16}