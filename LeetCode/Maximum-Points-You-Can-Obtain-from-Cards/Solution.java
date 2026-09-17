1class Solution {
2    public int maxScore(int[] arr, int k) {
3        int lsum=0;
4        int rsum=0;
5        int maxSum=0;
6        int lIdx=k-1;
7        //first take all from left
8        for(int i=0;i<=lIdx;i++){
9            lsum+=arr[i];
10        }
11        int sum=lsum+rsum;
12        maxSum = Math.max(sum,maxSum); //left total side sum 
13        int rIdx=arr.length-1;
14        while(rIdx>=arr.length-k){
15            lsum=lsum-arr[lIdx];
16            lIdx--;
17            rsum=rsum+arr[rIdx];
18            rIdx--;
19            sum=lsum+rsum;
20            maxSum = Math.max(sum,maxSum);
21        }
22        return maxSum;
23    }
24}