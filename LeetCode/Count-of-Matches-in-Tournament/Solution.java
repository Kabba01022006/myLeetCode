1class Solution {
2    public int numberOfMatches(int n) {
3        int left = n ;
4        int matches = 0 ;
5        while(left!=1){
6            if(left%2==0){
7                matches+=left/2;
8                left=left/2;
9            }
10            else if (left%2!=0){
11                matches+=(left-1)/2;
12                left=(left-1)/2+1;
13            }
14        }
15        return matches;
16    }
17}