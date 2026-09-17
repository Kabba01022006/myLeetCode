1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> list = new ArrayList<>();
4        if(p.length()>s.length()) return list;
5        int[] tar = new int[26];
6        int[] cur = new int[26];
7        for(int i=0;i<p.length();i++){
8            tar[p.charAt(i)-'a']++;
9            cur[s.charAt(i)-'a']++;
10        }
11        if(Arrays.equals(tar,cur)) list.add(0);
12        int left=0;
13        int right=p.length()-1;
14        while(right<s.length()-1){
15            cur[s.charAt(left)-'a']--;
16            left++;
17            right++;
18            cur[s.charAt(right)-'a']++;
19            if(Arrays.equals(tar,cur)) list.add(left);
20        }
21        return list;
22    }
23}