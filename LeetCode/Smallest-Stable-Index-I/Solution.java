1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        // make two arrays as same as the length of nums 
4
5        int[] maxArr = new int[nums.length];
6        int[] minArr = new int[nums.length];
7        
8        int max = Integer.MIN_VALUE;
9        int min = Integer.MAX_VALUE;
10
11        for(int i=0;i<nums.length;i++){
12            if(nums[i]>max){
13                max=nums[i];
14            }
15            maxArr[i]=max;
16        }
17        for(int i=nums.length-1;i>=0;i--){
18            if(nums[i]<min){
19                min=nums[i];
20            }
21            minArr[i]=min;
22        }
23        for(int i=0;i<nums.length;i++){
24            if(maxArr[i]-minArr[i]<=k) return i;
25        }
26        return -1;
27    }
28}
29