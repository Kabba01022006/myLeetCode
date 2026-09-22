1class Solution {
2    public int maxConsecutiveAnswers(String answerKey, int k) {
3        //leetcode 424 solution : (also works) 
4
5        // int left=0;
6        // int right=0;
7        // int[] freq = new int[26];
8        // int max = Integer.MIN_VALUE;
9        // int maxLen=0;
10        // while(right<answerKey.length()){
11        //     freq[answerKey.charAt(right)-'A']++;
12        //     max = Math.max(max,freq[answerKey.charAt(right)-'A']);
13        //     while(right-left+1>max+k){ //we need our window size <= max + k 
14        //         freq[answerKey.charAt(left)-'A']--;
15        //         left++;
16        //     }
17        //     maxLen=Math.max(maxLen,right-left+1);
18        //     right++;
19        // }
20        // return maxLen;
21        int left=0;
22        int right=0;
23        int tCount=0;
24        int fCount=0;
25        int maxLen=0;
26        int max=0;
27        while(right<answerKey.length()){
28            if(answerKey.charAt(right)=='F') fCount++;
29            else tCount++;
30            max=Math.max(fCount,tCount);
31            while(right-left+1>max+k){ //we need our window size <= max + k 
32                if(answerKey.charAt(left)=='F') fCount--;
33                else tCount--;
34                left++;
35            }
36            maxLen=Math.max(maxLen,right-left+1);
37            right++;
38        }
39        return maxLen;
40    }
41}