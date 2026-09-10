1class Solution {
2    public List<Integer> partitionLabels(String s) {
3        List<Integer> list = new ArrayList<>();
4        HashMap<Character,Integer> map = new HashMap<>();
5        for(int i=0;i<s.length();i++){
6            map.put(s.charAt(i),i);
7        }
8        int start=0;
9        int j=0;
10        while(j<s.length()){
11            int target = map.get(s.charAt(j));
12            while(j<=target){
13                if(j<s.length() && map.get(s.charAt(j))>target){
14                    target = map.get(s.charAt(j));
15                }
16                j++;
17            }
18            list.add(j-start);
19            start=j;
20        }
21        return list;
22    }
23}