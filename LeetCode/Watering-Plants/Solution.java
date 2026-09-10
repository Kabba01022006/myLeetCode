1class Solution {
2    public int wateringPlants(int[] plants, int capacity) {
3        int maxCap = capacity;
4        int step=0;
5        int i=0;
6        while(i<plants.length){
7            if(capacity>=plants[i]){
8                step++;
9                capacity-=plants[i];
10                i++;
11            }
12            else{
13                step += (2*i)+1;
14                capacity=maxCap;
15                capacity-=plants[i];
16                i++;
17            }
18        }
19        return step;
20    }
21}