1class Solution {
2    public int characterReplacement(String s, int k) {
3        int left=0;
4        int right=0;
5        int[] freq = new int[26];
6        int max = Integer.MIN_VALUE;
7        int maxLen=0;
8        while(right<s.length()){
9            freq[s.charAt(right)-'A']++;
10            max = Math.max(max,freq[s.charAt(right)-'A']);
11            while(right-left+1>max+k){
12                freq[s.charAt(left)-'A']--;
13                left++;
14            }
15            maxLen=Math.max(maxLen,right-left+1);
16            right++;
17        }
18        return maxLen;
19    }
20}