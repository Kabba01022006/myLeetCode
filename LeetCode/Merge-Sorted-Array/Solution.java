1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        // start  backwards
4        int len = m + n;
5
6        int i=m-1;
7        int j=n-1;
8        int k=len-1;
9
10        while(j>=0 && i>=0){
11            if(nums2[j]>=nums1[i]){
12                nums1[k]=nums2[j];
13                j--;
14                k--;
15            }
16            else if ( nums1[i]>nums2[j]){
17                nums1[k]=nums1[i];
18                i--;
19                k--;
20            }
21        }
22        while(j>=0){
23            nums1[k]=nums2[j];
24            j--;
25            k--;
26        }
27    }
28}