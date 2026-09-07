1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int count=0;
4        int strLen = strs[0].length();
5        for(int i=0;i<strLen;i++){
6            for(int j=0;j<strs.length-1;j++){
7                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
8                    count++;
9                    break;
10                }
11                
12            }
13        }
14        return count;
15    }
16}