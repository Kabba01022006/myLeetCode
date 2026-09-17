1class Solution {
2    public int countGoodSubstrings(String s) {
3        if(s.length()<3) return 0;
4        int left=0;
5        int right=2;
6        int count=0;
7        while(right<s.length()){
8            if(!(s.charAt(left)==s.charAt(left+1) || s.charAt(left)==s.charAt(right) || s.charAt(right)==s.charAt(right-1))) count++;
9            right++;
10            left++;
11        }
12        return count;
13    }
14}