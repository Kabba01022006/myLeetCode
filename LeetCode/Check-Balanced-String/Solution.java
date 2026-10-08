1class Solution {
2    public boolean isBalanced(String num) {
3        int oddSum=0;
4        int evenSum=0;
5        for(int i=0;i<num.length();i++){
6            int digit = num.charAt(i) - '0';
7            if(i%2==0) evenSum+=digit;
8            else oddSum+=digit;
9        }
10        return oddSum==evenSum;
11    }
12}