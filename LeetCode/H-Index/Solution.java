1class Solution {
2    public int hIndex(int[] citations) {
3        int h=0;
4        int maxh=0;
5
6        while(h<=citations.length){ //as if arr length is 5 , max h possible is 5 as well
7            int count = 0;
8            for(int j=0;j<citations.length;j++){
9                if(citations[j]>=h){
10                    count++;
11                }
12            }
13            if(count>=h){
14                maxh = Math.max(maxh,h);
15            }
16            h++;
17        }
18        return maxh;
19    }
20}