1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            if(sum(nums[i])==i) return i;
5        }
6        return -1;
7    }
8    public int sum(int num){
9        int sum=0;
10        while(num!=0){
11            sum+=num%10;
12            num/=10;
13        }
14        return sum;
15    }
16}