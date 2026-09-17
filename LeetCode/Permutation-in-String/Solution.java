1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length()>s2.length()) return false;
4        int[] freq = new int[26];
5        int[] win = new int[26];
6        for(int i=0;i<s1.length();i++){
7            freq[s1.charAt(i)-'a']++;
8            win[s2.charAt(i)-'a']++;
9        }
10        if(Arrays.equals(freq,win)) return true;
11        int left=0;
12        int right=s1.length()-1;
13        while(right<s2.length()-1){
14            win[s2.charAt(left)-'a']--;
15            left++;
16            right++;
17            win[s2.charAt(right)-'a']++;
18            if(Arrays.equals(freq,win)) return true;
19        }
20        return false;
21    }
22}