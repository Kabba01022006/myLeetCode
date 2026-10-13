1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long sum=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]<0) nums[i]*=-1;
6        }
7        Arrays.sort(nums);
8        int i=0;
9        int j=0;
10        if(nums.length%2==0) j=nums.length-1;
11        else j=nums.length-2;
12        while(i<j){
13            sum+=(long)nums[j]*nums[j];
14            sum-=(long)nums[i]*nums[i];
15            i++;
16            j--;
17        }
18        if(nums.length%2!=0) sum+=(long)nums[nums.length-1]*nums[nums.length-1];
19        return sum;
20    }
21}
22
23