1class Solution {
2    public int subarraySum(int[] nums, int k) {
3
4        // We need to store the frequency of each prefix sum.
5        // For example, if prefix sum -3 occurs 3 times:
6        // -3 -> 3
7        // We don't need indices here.
8
9        HashMap<Integer,Integer> map = new HashMap<>();
10
11        map.put(0,1); //means at the beginning our prefix sum is 0 which has appeared only once 
12        int currSum=0;
13        int count=0;
14        for(int i=0;i<nums.length;i++){
15            currSum+=nums[i];
16            if(map.containsKey(currSum-k)){
17                count+=map.get(currSum-k);
18            }
19            map.put(currSum,map.getOrDefault(currSum,0)+1);
20        }
21        return count;
22    }  
23}