1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(!map.containsKey(nums[i])){
6                ArrayList<Integer> list = new ArrayList<>();
7                list.add(i);
8                map.put(nums[i],list);
9            }
10            else{
11                map.get(nums[i]).add(i);
12            }
13        }
14        int count=0;
15        for(int ele:map.keySet()){
16            if(map.get(ele).size()==3){
17                if(map.get(ele).get(1)-map.get(ele).get(0)==map.get(ele).get(2)-map.get(ele).get(1)){
18                    count++;
19                }
20            }
21        }
22        return count;
23    }
24}