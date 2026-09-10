1class Solution {
2    public boolean canJump(int[] nums) {
3        //[2, 0, 3, 0, 0, 1, 1]
4        int target = nums.length-1;
5        int start = nums.length-2;
6        while(start>=0){
7            while(start>=0 && !(nums[start]>=(target-start))){
8                start--;
9            }
10            if(start==-1) return false;
11            target = start;
12            start = target-1;
13        }
14        return true;
15    }
16}