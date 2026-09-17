1class Solution {
2    public int countGoodSubstrings(String s) {
3        if(s.length()<3) return 0;
4        HashMap<Character,Integer> map = new HashMap<>();
5        int left=0;
6        int right=2;
7        int count=0;
8        for(int i=left;i<=right;i++){
9            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
10        }
11        if(map.size()==3) count++;
12        while(right<s.length()-1){
13            map.put(s.charAt(left),map.get(s.charAt(left))-1);
14            if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
15            left++;
16            right++;
17            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
18            if(map.size()==3) count++;
19        }
20        return count;
21    }
22}