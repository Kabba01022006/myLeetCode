1class Solution {
2    public boolean isPossibleDivide(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        if(nums.length%k!=0){
5            return false;
6        }
7        for(int i=0;i<nums.length;i++){
8            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9        }
10        Arrays.sort(nums);
11        for(int i=0;i<nums.length;i++){
12            if(map.get(nums[i]) <= 0){
13                continue;
14            }
15            int start = nums[i];
16            for(int j=0;j<k;j++){
17            if(!map.containsKey(start)){
18                return false;
19            }
20            else if(map.containsKey(start+1) && map.get(start)<=0){
21                return false;
22            }
23            else{
24                map.put(start,map.get(start)-1);
25                start++;
26            }
27        }
28    }
29    return true;
30    }
31}
32