1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder sb = new StringBuilder();
4        int minLen=201;
5        String strMin = "abcdefghijklmnopqrstuvwxyz";
6        for(int i=0;i<strs.length;i++){
7            if(strs[i].length()<minLen){
8                minLen=strs[i].length();
9                strMin=strs[i];
10            }
11        }
12        for(int i=0;i<minLen;i++){
13            char ch = strMin.charAt(i);
14            for(int j=0;j<strs.length;j++){
15                if(strs[j].charAt(i)!=ch){
16                    return sb.toString();
17                }
18            }
19            sb.append(ch);
20        }
21        return sb.toString();
22    }
23}