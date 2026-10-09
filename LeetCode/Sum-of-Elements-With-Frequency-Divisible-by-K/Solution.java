1class Solution {
2    public int sumDivisibleByK(int[] nums, int k) {
3        int[] freq = new int[101];
4        for(int i=0;i<nums.length;i++){
5            freq[nums[i]]++;
6        }
7        int sum=0;
8        for(int i=0;i<freq.length;i++){
9            if(freq[i]%k==0) sum+=(freq[i]*i);
10        }
11        return sum;
12    }
13}