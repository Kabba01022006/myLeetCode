1class Solution {
2    public int largestAltitude(int[] gain) {
3        int prevAlt = 0 ;
4        int currentAlt = 0 ;
5        int maxAlt = 0;
6        int i = 0;
7        while(i<gain.length){
8            currentAlt=prevAlt+gain[i];
9            if(currentAlt>=maxAlt){
10                maxAlt=currentAlt;
11            }
12            prevAlt = currentAlt;
13            i++;
14        }
15        return maxAlt;
16    }
17}