1class Solution {
2    public int majorityElement(int[] nums) {
3        int tar=nums.length/2;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int ele:nums){
6            map.put(ele,map.getOrDefault(ele,0)+1);
7            if(map.get(ele)>tar) return ele;
8            // map.put(ele,map.getOrDefault(ele,0)+1);
9        }
10        // for(int ele:map.keySet()){
11        //     if(map.get(ele)>tar) return ele;
12        // }
13        return -1;
14    }
15}