1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low=0;
5        int high=n-1;
6        int k=0;
7        while(low<high){
8            int mid=low+(high-low)/2;
9            if(nums[mid]>nums[high]){
10                //go right
11                low=mid+1;
12            }
13            else {
14                //go left
15                high=mid;
16            }
17        }
18        k=low;
19        low=0;
20        high=k-1;
21        while(low<=high){
22            int mid=low+(high-low)/2;
23            if(nums[mid]<target){
24                low=mid+1;
25            }
26            else if(nums[mid]>target){
27                high=mid-1;
28            }
29            else{
30                return mid;
31            }
32        }
33        low=k;
34        high=n-1;
35        while(low<=high){
36            int mid=low+(high-low)/2;
37            if(nums[mid]<target){
38                low=mid+1;
39            }
40            else if(nums[mid]>target){
41                high=mid-1;
42            }
43            else{
44                return mid;
45            }
46        }
47        return -1;
48    }
49}