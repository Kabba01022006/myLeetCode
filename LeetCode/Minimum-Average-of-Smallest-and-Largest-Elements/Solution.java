1class Solution {
2    public double minimumAverage(int[] nums) {
3        Arrays.sort(nums);
4        double min = 10000;
5        int i=0;
6        int j=nums.length-1;
7        while(i<j){
8            double avg = (nums[i] + nums[j])/(double)2;
9            min = Math.min(min,avg);
10            i++;
11            j--;
12        }
13        return min;
14    }
15}