1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] temp = new int[m];
4        for(int i=0;i<m;i++){
5            temp[i] = nums1[i];
6        }
7        int i=0,j=0,k=0;
8        while(i<m && j<n){
9            if(temp[i]<nums2[j]){
10                nums1[k] = temp[i];
11                i++; 
12            }
13            else{
14                nums1[k] = nums2[j];
15                j++;
16            }
17            k++;
18        }
19        while(i<m){
20            nums1[k] = temp[i];
21            i++;
22            k++;
23        }
24        while(j<n){
25            nums1[k] = nums2[j];
26            j++;
27            k++;
28        } 
29    }
30}
31
32// no need for return ; statement when its void , just simply skip it.