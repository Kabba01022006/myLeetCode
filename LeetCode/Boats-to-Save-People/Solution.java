1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int count=0;
5        int i=0;
6        int j=people.length-1;
7        while(i<=j){
8            if(people[i]+people[j]<=limit){
9                count++;
10                i++;
11                j--;
12            }
13            else{
14                count++;
15                j--;
16            }
17        }
18        return count;   
19    }
20}