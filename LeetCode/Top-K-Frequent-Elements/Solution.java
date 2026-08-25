1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        int[] ans = new int[k];
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(nums[i])){
7                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8            }
9            else{
10                map.put(nums[i],1);
11            }
12        }
13        List<List<Integer>> list = new ArrayList<>();
14        for(int ele:map.keySet()){
15            List<Integer> sub = new ArrayList<>();
16            sub.add(ele);
17            sub.add(map.get(ele));
18            list.add(sub);
19            sub = new ArrayList<>();
20        }
21        //sort the list based on the second index (descending order)
22        Collections.sort(list,(a,b) -> b.get(1)-a.get(1));
23        for(int i=0;i<k;i++){
24            ans[i]=list.get(i).get(0);
25        }
26        return ans;
27    }
28}
29
30//this is brute force ka bhi brute force solution lmao