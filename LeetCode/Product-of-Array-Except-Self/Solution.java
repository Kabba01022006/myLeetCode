1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] prefix = new int[n];
5        int[] suffix = new int[n];
6        int[] ans = new int[n];
7        int leftP=1;
8        int rightP=1;
9        prefix[0]=1;
10        for(int i=1;i<n;i++){
11            leftP=leftP*nums[i-1];
12            prefix[i]=leftP;
13        }
14        suffix[n-1]=1;
15        for(int i=n-2;i>=0;i--){
16            rightP=rightP*nums[i+1];
17            suffix[i]=rightP;
18        }
19        for(int i=0;i<n;i++){
20            ans[i]=prefix[i]*suffix[i];
21        }
22        return ans;
23    }
24}