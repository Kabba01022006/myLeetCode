1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int left=0;
4        int right=k-1;
5        long sum=0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        for(int i=left;i<=right;i++){
8            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9            sum+=nums[i];
10        }
11        long maxSum = Long.MIN_VALUE;
12        if(map.size()==k){
13            maxSum = Math.max(maxSum,sum);
14        }
15        
16        while(right<nums.length-1){
17            sum-=nums[left];
18            map.put(nums[left],map.get(nums[left])-1);
19            if(map.get(nums[left])==0) map.remove(nums[left]);
20            left++;
21            right++;
22            sum+=nums[right];
23            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
24
25            if(map.size()==k){
26            maxSum = Math.max(maxSum,sum);
27            }
28        }
29
30        if(maxSum==Long.MIN_VALUE) return 0;
31        return maxSum;
32    }
33}