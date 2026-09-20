1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        HashMap<Integer,Integer> map = new HashMap<>();
5        int len = intervals.length;
6        for(int i=0;i<intervals.length;i++){
7            map.put(intervals[i][0],map.getOrDefault(intervals[i][0],0)+1);
8        }
9        int count=0;
10        for(int i=0;i<intervals.length;i++){
11            map.put(intervals[i][0],map.get(intervals[i][0])-1);
12            if(map.get(intervals[i][0])==0) map.remove(intervals[i][0]);
13            for(int ele:map.keySet()){
14                int curr=0;
15                if(ele<=intervals[i][1]){
16                    curr+=map.get(ele);
17                }
18                count+=curr;
19            }
20        }
21        return count;
22    }
23}