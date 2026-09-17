1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int left=0;
4        int right=k-1;
5        int sum=0;
6        int count=0;
7        for(int i=0;i<=right;i++){
8            sum+=arr[i];
9        }
10        if(sum/k>=threshold) count++;
11        while(right<arr.length-1){
12            sum=sum-arr[left];
13            left++;
14            right++;
15            sum=sum+arr[right];
16            if(sum/k>=threshold) count++;
17        }
18        return count;
19    }
20}