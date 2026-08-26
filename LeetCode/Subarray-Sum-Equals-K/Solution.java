1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>(); //<prefixSum,frequency>
4        int count=0;
5        int currSum=0;
6        map.put(0,1);
7        for(int i=0;i<nums.length;i++){
8            currSum+=nums[i];
9            if(map.containsKey(currSum-k)){
10                count+=map.get(currSum-k);
11            }
12            map.put(currSum,map.getOrDefault(currSum,0)+1);
13        }
14        return count;
15    }
16}