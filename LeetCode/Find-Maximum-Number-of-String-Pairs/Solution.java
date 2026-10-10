1class Solution {
2    public int maximumNumberOfStringPairs(String[] words) {
3        HashMap<String,Integer> map = new HashMap<>();
4        int pairs = 0 ;
5        for(int i=0;i<words.length;i++){
6            String ori = words[i];
7            char[] charArray = ori.toCharArray();
8            Arrays.sort(charArray);
9            String sorted = new String(charArray);
10            map.put(sorted,map.getOrDefault(sorted,0)+1);
11        }
12        for(String ele : map.keySet()){
13            pairs += map.get(ele) -1;
14        }
15        return pairs;
16    }
17}