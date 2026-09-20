1class Solution {
2    public int reverseDegree(String s) {
3        int sum=0;
4        for(int i=0;i<s.length();i++){
5            sum+=Math.abs(s.charAt(i)-'a'-26)*(i+1);
6        }
7        return sum;
8    }
9}