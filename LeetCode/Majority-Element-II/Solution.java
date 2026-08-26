1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int tar = nums.length/3;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        List<Integer> ans = new ArrayList<>();
6        for(int ele:nums){
7            map.put(ele,map.getOrDefault(ele,0)+1);
8        }
9        for(int ele:map.keySet()){
10            if(map.get(ele)>tar){
11                ans.add(ele);
12            }
13        }
14        return ans;
15    }
16}