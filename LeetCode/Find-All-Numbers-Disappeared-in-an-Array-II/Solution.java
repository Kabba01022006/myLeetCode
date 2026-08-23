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
14        List<Integer> sub = new ArrayList<>();
15        if (missing.size() == 0) {
16            return ans;
17        }
18        sub.add(missing.get(0));
19        int i=1;
20        while(i<missing.size()){
21            if(missing.get(i)-missing.get(i-1)==1){
22                i++;
23            }
24            else if(missing.get(i)-missing.get(i-1)!=1){
25                sub.add(missing.get(i-1));
26                ans.add(sub);
27                sub = new ArrayList<>();
28                sub.add(missing.get(i));
29                i++;
30            }
31        }
32        sub.add(missing.get(missing.size() - 1));
33        ans.add(sub);
34        // while (i<missing.size()) {
35        //     int start = missing.get(i);
36        //     while (i+1<missing.size() && missing.get(i+1)-missing.get(i)==1){
37        //         i++;
38        //     }
39        //     int end = missing.get(i);
40        //     List<Integer> sub = new ArrayList<>();
41        //     sub.add(start);
42        //     sub.add(end);
43        //     ans.add(sub);
44        //     i++;
45        // }
46        return ans;
47    }
48}