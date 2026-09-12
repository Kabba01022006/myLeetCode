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
15        ArrayList<Integer> list = new ArrayList<>();
16        for(int ele:map.keySet()){
17            if(map.get(ele).size()>=3){
18                boolean flag = true;
19                ArrayList<Integer> innerList = map.get(ele);
20                int gap = innerList.get(1) - innerList.get(0);
21                for(int i=1;i<innerList.size();i++){
22                    if(innerList.get(i)-innerList.get(i-1)!=gap){
23                        flag=false;
24                    }
25                }
26                if(flag==true) count++;
27                
28            }
29        }
30        return count;
31    }
32}