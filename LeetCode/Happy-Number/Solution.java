1class Solution {
2    public boolean isHappy(int n) { //if n is 19
3        HashSet<Integer> set = new HashSet<>();
4        set.add(n);
5        int ori = n ;  // our ori = 19 
6        int curr = n;
7        while(true){
8            curr = giveSum(ori);
9            if(curr==1){
10                return true;
11            }
12            if(set.contains(curr)){
13                return false;
14            }
15            set.add(curr);
16            ori = curr;
17        }
18    }
19
20    public int giveSum(int inp){
21        int sum=0;
22        while(inp!=0){
23            int digit = inp%10;
24            sum+=(digit*digit);
25            inp=inp/10;
26        }
27        return sum;
28    }
29}