1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        List<Integer> missing = new ArrayList<>();
8        for(int i=lower;i<=upper;i++){
9            if(!set.contains(i)){
10                missing.add(i);
11            }
12        }
13        List<List<Integer>> ans = new ArrayList<>();
14        if (missing.size() == 0) {
15            return ans;
16        }
17        int i=0;
18        while (i<missing.size()) {
19            int start = missing.get(i);
20            while (i+1<missing.size() && missing.get(i+1)-missing.get(i)==1){
21                i++;
22            }
23            int end = missing.get(i);
24            List<Integer> sub = new ArrayList<>();
25            sub.add(start);
26            sub.add(end);
27            ans.add(sub);
28            i++;
29        }
30        return ans;
31    }
32}