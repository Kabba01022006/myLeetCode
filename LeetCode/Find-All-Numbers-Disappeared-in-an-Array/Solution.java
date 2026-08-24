1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans  = new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            if(nums[Math.abs(nums[i])-1]>0){
6                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
7            }
8        }
9        for(int i=0;i<nums.length;i++){
10            if(nums[i]>0){
11                ans.add(i+1);
12            }
13        }
14        return ans;
15    }
16}