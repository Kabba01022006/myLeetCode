1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int i=0; //i should only have even
4        int j=1; //j should only have odd
5
6        int n=nums.length;
7        while(i<n && j<n){
8            while(i<n && nums[i]%2==0){
9                i+=2;
10            }
11            while(j<n && nums[j]%2!=0){
12                j+=2;
13            }
14            //now we have got i that has odd element and j that has even element
15            //so we swap
16            //but before swapping we need to check if our i and j are in bounds
17
18            if(i<n && j<n){
19                int temp = nums[i];
20                nums[i] = nums[j];
21                nums[j] = temp;
22            }
23        }
24        return nums;
25    }
26}