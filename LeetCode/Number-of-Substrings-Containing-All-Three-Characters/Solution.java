1class Solution {
2    public int numberOfSubstrings(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int left=0;
5        int right=0;
6        int count=0;
7        while(right<s.length()){
8            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
9            while(map.size()==3){
10                map.put(s.charAt(left),map.get(s.charAt(left))-1);
11                if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
12                left++;
13            }
14            count+=left;
15            right++;
16        }
17        return count;
18    }
19}