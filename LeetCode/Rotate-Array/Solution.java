1class Solution {
2    public static void reverse(int[] arr,int st,int end){
3        while(st<end){
4            int temp = arr[st];
5            arr[st] = arr[end];
6            arr[end] = temp;
7            
8            st++;
9            end--;
10        }
11    }
12    public void rotate(int[] nums, int k) {
13        int n=nums.length;
14        k = k % n;
15        reverse(nums,0,n-1);
16        reverse(nums,0,k-1);
17        reverse(nums,k,n-1);
18    }
19}