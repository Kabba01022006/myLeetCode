1class Solution {
2    public int countCompleteDayPairs(int[] hours) {
3        int pairs=0;
4        for(int i=0;i<hours.length-1;i++){
5            for(int j=i+1;j<hours.length;j++){
6                if(((hours[i]+hours[j])%24)==0) pairs++;
7            }
8        }
9        return pairs;
10    }
11}