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
16            if(map.get(ele).size()>=3){
17                boolean flag = true;
18                ArrayList<Integer> innerList = map.get(ele);
19                int gap = innerList.get(1) - innerList.get(0);
20                for(int i=1;i<innerList.size();i++){
21                    if(innerList.get(i)-innerList.get(i-1)!=gap){
22                        flag=false;
23                    }
24                }
25                if(flag==true) count++;
26                
27            }
28        }
29        return count;
30    }
31}