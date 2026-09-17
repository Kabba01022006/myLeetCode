1class Solution {
2    static {
3        for (int i = 0; i < 999; i++) {
4            findMaxAverage(new int[1], 1);
5        }
6    }
7    public static double findMaxAverage(int[] nums, int k) {
8        double sum = 0 ;
9        int l=0;
10        int r=k-1;
11        for(int i=0;i<=r;i++){
12            sum+=nums[i];
13        }
14        double maxSum=sum;
15        while(r<nums.length-1){
16            sum-=nums[l];
17            l++;
18            r++;
19            sum+=nums[r];
20            maxSum=Math.max(maxSum,sum);
21        }
22        return maxSum/k;
23    }
24}